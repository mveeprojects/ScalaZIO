# ScalaZIO

Simple Scala apps in ZIO to learn about this technology.

### hello_zio_basic

Very basic equivalent of the below, in ZIO.

```scala
object Main extends App {
  println("Hello, World.")
}
```

### hello_zio_rest_api

REST API written in ZIO, based on the quickstart-restful-webservice linked below.

Endpoints:
- Hello -> http://localhost:8080/hello
- Hello "name in path param" -> http://localhost:8080/hello/mark
- Hello "name in query param" -> http://localhost:8080/hello?name=mark

### Sources
- [SBT: Multi-project builds](https://www.scala-sbt.org/1.x/docs/Multi-Project.html)
- [Baeldung: Introduction to ZIO](https://www.baeldung.com/scala/zio-intro)
- [YouTube: Real-world functional programming in Scala using ZIO - a tour by Yonas Ghidei
  ](https://www.youtube.com/watch?v=S6CkX0u3Cv0)
  - [GitHub repo used in the talk](https://github.com/ghidei/funcprog2022)
- [ZIO guides and documentation](https://zio.dev/guides/)
  - https://github.com/zio/zio-quickstart-hello-world
  - https://github.com/zio/zio-quickstart-restful-webservice
  - https://zio.dev/guides/tutorials/configurable-zio-application/
