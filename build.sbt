organization := "com.sojo"

version := "0.2.0-SNAPSHOT"

scalaVersion := "2.10.3"

resolvers ++= Seq("spray" at "http://repo.spray.io")

libraryDependencies ++= Seq(
	"io.spray" % "spray-client" % "1.2.1",
	"io.spray" %%  "spray-json" % "1.2.5"
)
