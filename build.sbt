name := "JavaDependentTypes"

version := "0.1"

scalaVersion := "2.12.4"

PB.targets in Compile := Seq(
  PB.gens.java -> (sourceManaged in Compile).value,
  scalapb.gen(javaConversions = true) -> (sourceManaged in Compile).value
)

scalafmtOnCompile := true
