resolvers ++= Seq(
  Classpaths.typesafeReleases,
  Classpaths.sbtPluginReleases,
  "jgit-repo" at "http://download.eclipse.org/jgit/maven"
)

addSbtPlugin("com.47deg" % "sbt-microsites" % "0.6.1")
addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.1.0")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.5")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.1")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.15")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.9.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.27")
