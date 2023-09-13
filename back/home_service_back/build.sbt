ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "home_service_back"
  )

val AkkaVersion = "2.7.0"
val AkkaHttpVersion = "10.5.2"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed"   % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream"        % AkkaVersion,
  "com.typesafe.akka" %% "akka-http"          % AkkaHttpVersion,
  "com.typesafe"      % "config"              % "1.4.2"
)