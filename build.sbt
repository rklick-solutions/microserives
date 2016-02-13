name := "play-microservices"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

resolvers += Resolver.typesafeIvyRepo("releases")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
"com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.0-rc2"
)
