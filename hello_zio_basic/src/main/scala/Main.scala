
import zio._

import java.io.IOException

object Main extends ZIOAppDefault {
  def run: ZIO[Any, IOException, Unit] = {
    Console.printLine("Hello ZIO")
  }
}
