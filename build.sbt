organization := "com.example"

name := "scalatra-sbt-prototype"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.2"

jetty()

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.3.0",
  "org.scalatra" %% "scalatra-scalate" % "2.3.0",
  "org.scalatra" %% "scalatra-specs2" % "2.3.0" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.2" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.1.v20140609" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

