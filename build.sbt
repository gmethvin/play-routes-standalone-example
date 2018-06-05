
lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "test project",
    libraryDependencies += akkaHttpServer
  )
  .enablePlugins(RoutesCompiler)
  .settings(
    sources in (Compile, routes) ++= {
      val dirs = (unmanagedResourceDirectories in Compile).value
      (dirs * "routes").get ++ (dirs * "*.routes").get
    }
  )
