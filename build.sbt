lazy val baseSettings = Seq(
  version := "0.0.1",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")
)
lazy val whitebox_macro_sample_foo = (project in file("whitebox_macro_sample_foo")).
  settings(
    baseSettings,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value,
    name := "whitebox_macro_sample_foo"
  )
lazy val whitebox_macro_sample_int = (project in file("whitebox_macro_sample_int")).
  settings(
    baseSettings,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value,
    name := "whitebox_macro_sample_int"
  )
lazy val whitebox_macro_sample_any = (project in file("whitebox_macro_sample_any")).
  settings(
    baseSettings,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value,
    name := "whitebox_macro_sample_any"
  )
lazy val main = (project in file("main")).
  dependsOn(whitebox_macro_sample_foo, whitebox_macro_sample_int, whitebox_macro_sample_any).
  settings(
    baseSettings,
    name := "main"
  )
