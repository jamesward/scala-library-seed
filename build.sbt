name := "scala-library-seed"

organization := "com.example"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

scalaVersion := "2.10.4"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

bintraySettings

com.typesafe.sbt.SbtGit.versionWithGit
