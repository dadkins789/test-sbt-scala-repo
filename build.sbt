scalacOptions += "-feature"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies +=  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"
libraryDependencies +=  "com.typesafe.akka" % "akka-agent_2.11" % "2.3.9"
libraryDependencies +=  "com.typesafe.akka" % "akka-remote_2.11" % "2.3.9"
libraryDependencies +=  "com.typesafe.akka" % "akka-slf4j_2.11" % "2.3.9"
libraryDependencies +=  "com.typesafe.akka" % "akka-zeromq_2.11" % "2.3.9"
libraryDependencies +=  "org.slf4j" % "slf4j-nop" % "1.6.4"
libraryDependencies +=  "com.typesafe.slick" %% "slick" % "2.1.0"
libraryDependencies +=  "mysql" % "mysql-connector-java" % "5.1.12"
lazy val root = (project in file(".")).

settings(
  name := "junk",
  version := "0.2.3",
  scalaVersion := "2.11.6"
)
