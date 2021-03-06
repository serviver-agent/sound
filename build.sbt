import Dependencies._

ThisBuild / scalaVersion := "3.1.0"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.serviveragent"
ThisBuild / organizationName := "serviveragent"

lazy val commonSettings = Seq(
  scalafmtOnCompile := true
)

lazy val root = (project in file("."))
  .settings(
    name := "sound",
    commonSettings,
    libraryDependencies += akkaActorTyped,
    libraryDependencies += scalaTest,
    libraryDependencies += commonsMath,
    libraryDependencies += logback % Runtime,
    assembly / mainClass := Some("com.serviveragent.Main")
  )
