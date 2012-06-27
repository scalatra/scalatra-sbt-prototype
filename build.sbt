organization := "com.example"

name := "scalatra-sbt-prototype"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.1.0.M2",
  "org.scalatra" % "scalatra-scalate" % "2.1.0.M2",
  "org.scalatra" % "scalatra-specs2" % "2.1.0.M2" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.3.v20120416" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet"      % "3.0.0.v201112011016" % "provided;container" artifacts(Artifact("javax.servlet", "orbit", "jar")),
  "javax.servlet" % "javax.servlet-api"  % "3.0.1" % "provided;container"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
