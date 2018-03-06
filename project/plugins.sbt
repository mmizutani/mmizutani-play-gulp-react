addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.11")
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
addSbtPlugin("com.heroku" % "sbt-heroku" % "2.1.1")

resolvers += Resolver.bintrayIvyRepo("mmizutani", "sbt-plugins")
addSbtPlugin("com.github.mmizutani" % "sbt-play-gulp" % "0.2.0")
