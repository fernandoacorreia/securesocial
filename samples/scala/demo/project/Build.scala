import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "ssdemo-scala"
    val appVersion      = "1.0"

    val appDependencies = Seq(
    "ws.securesocial" %% "securesocial" % "2.1.5-ldap-SNAPSHOT"
    )
    val main = play.Project(appName, appVersion, appDependencies).settings(
	resolvers += Resolver.sonatypeRepo("releases")
    )
}
