name := "just-play-scala"

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

// http://mvnrepository.com/artifact/com.typesafe.play/fork-run_2.10
// libraryDependencies ++= Seq( "com.typesafe.play" % "fork-run_2.10" % "2.4.2", "net.contentobjects.jnotify" % "jnotify" % "0.94")

fork in run := true