lazy val baseSettings = Seq(
  version := "0.0.1",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")
)
lazy val whitebox_macro_sample = (project in file("whitebox_macro_sample")).
  settings(
    baseSettings,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value,
    name := "whitebox_macro_sample"
  )
lazy val main = (project in file("main")).
  dependsOn(whitebox_macro_sample).
  settings(
    baseSettings,
    name := "main"
  )
