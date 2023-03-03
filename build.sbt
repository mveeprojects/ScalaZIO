import Dependencies._

name := "ScalaZIO"

ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.10"

lazy val hello_zio_basic = project
  .settings(libraryDependencies ++= zio)

lazy val hello_zio_rest_api = project
  .settings(libraryDependencies ++= zio ++ http)

val root = Project("ScalaZIO", file("."))
  .aggregate(hello_zio_basic, hello_zio_rest_api)
