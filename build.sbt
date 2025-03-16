ThisBuild / name := "SpinalWorkshop"
ThisBuild / version := "1.0"
ThisBuild / scalaVersion := "2.13.14"
ThisBuild / organization := "org.example"
val scalactic = "org.scalactic" %% "scalactic" % "3.2.19"
val scalatest = "org.scalatest" %% "scalatest" % "3.2.19" % "test"
val spinalVersion = "1.11.0"
val spinalCore = "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion
val spinalLib = "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion
val spinalIdslPlugin = compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion)
val spinalTester = "com.github.spinalhdl" %% "spinalhdl-tester" % spinalVersion
lazy val projectname = (project in file("."))
  .settings(
    // Compile / scalaSource := baseDirectory.value / "hw" / "spinal",
    libraryDependencies ++= Seq(scalactic, scalatest, spinalCore, spinalLib, spinalIdslPlugin, spinalTester)
  )

fork := true
