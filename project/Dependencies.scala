import sbt._

object Dependencies {

  val zioVersion = "2.0.9"

  val zio: Seq[ModuleID] = Seq(
    "dev.zio" %% "zio" % zioVersion,
    "dev.zio" %% "zio-streams" % zioVersion
  )

  val http: Seq[ModuleID] = Seq(
    "io.d11" %% "zhttp" % "2.0.0-RC10"
  )
}
