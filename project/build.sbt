libraryDependencies += "org.kohsuke" % "github-api" % "1.59" exclude("org.jenkins-ci", "annotation-indexer")
libraryDependencies ++= Seq(
  "io.get-coursier" %% "coursier" % "1.0.1",
  "io.get-coursier" %% "coursier-cache" % "1.0.1"
)

disablePlugins(TravisCiPlugin)

scalacOptions ++= scalacOptions_2_12

scalacOptions --= Seq(
  "-Ywarn-unused:imports",
  "-Yinduction-heuristics",
  "-Ykind-polymorphism",
  "-Xstrict-patmat-analysis")

// sbt/sbt#2572
scalacOptions in (Compile, console) --= Seq(
  "-Yno-imports",
  "-Ywarn-unused:imports")
