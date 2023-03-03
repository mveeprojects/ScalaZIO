import zhttp.http._
import zhttp.service.Server
import zio._

object Main extends ZIOAppDefault {
  def run: ZIO[Any with ZIOAppArgs with Scope, Throwable, Nothing] = {
    println("Starting REST API")
    Server.start(
    8080,
        GreetingApp()
    )
  }
}

object GreetingApp {
  def apply(): Http[Any, Nothing, Request, Response] = Http.collect[Request] {
    case req@Method.GET -> _ / "hello" if req.url.queryParams.nonEmpty =>
      Response.text(s"Hello ${req.url.queryParams("name").mkString(" and ")}!")
    case Method.GET -> _ / "hello" => Response.text("Hello")
    case Method.GET -> _ / "hello" / pathparam => Response.text(s"Hello $pathparam")
  }
}
