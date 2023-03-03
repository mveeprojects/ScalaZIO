# ScalaZIO

Simple Scala app implementing ZIO to learn about this technology.

### hello_zio_basic

Simple "hello world" console app.

### hello_zio_rest_api

REST API written in ZIO, based on the quickstart-restful-webservice linked below.

Endpoints:
- Hello -> http://localhost:8080/hello
- Hello "name in path param" -> http://localhost:8080/hello/mark
- Hello "name in query param" -> http://localhost:8080/hello?name=mark

### Sources
- [ZIO guides and documentation](https://zio.dev/guides/)
  - https://github.com/zio/zio-quickstart-hello-world
  - https://github.com/zio/zio-quickstart-restful-webservice
  - https://zio.dev/guides/tutorials/configurable-zio-application/
- [SBT: Multi-project builds](https://www.scala-sbt.org/1.x/docs/Multi-Project.html)
