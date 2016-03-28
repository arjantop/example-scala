import sbt._
import Keys._

import com.celtra.sbt.SbtStartScript.startScriptForClassesSettings
import com.celtra.sbt.SbtStartScript.StartScriptKeys._

name := "scala"

version := "0.98.5"

scalaVersion := "2.10.4"

coverageHighlighting := false

testOptions in Test += Tests.Argument("-oD")

testPackage := "com.awesomeness"

seq(startScriptForClassesSettings: _*)

coverageEnabled := true

coverageHighlighting := false

libraryDependencies ++= Seq(
  "junit"          % "junit"           % "4.5",
  "org.scalatest"  % "scalatest_2.10"  % "2.2.0"
)
