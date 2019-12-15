//ThisBuild / organization := "com.abc.def"
//ThisBuild / version := "2.0-SNAPSHOT"

//name := "My Project"

lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

 //publishArtifact in root := true



//publishArtifact in Test := true

updateOptions := updateOptions.value.withGigahorse(false)

resolvers += "Artifactory" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot/"
publishTo := Some("Artifactory Realm" at "https://shanmukha420.jfrog.io/shanmukha420/example-snapshot")
/*
publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishTo := {
  val Artifactory = "https://shanmukha420.jfrog.io/"
  if (isSnapshot.value)
    Some("snapshots" at Artifactory + "/shanmukha420/Test")
  else
    Some("releases"  at Artifactory + "/shanmukha420/Test")
}
*/


 credentials += Credentials(new File("credentials.properties"))

 libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"

