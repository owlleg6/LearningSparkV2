 //name of the package
 // To build simply type `sbt clean package`
name := "main/scala/chapter3"
//version of our package
version := "1.0"
//version of Scala
scalaVersion := "2.13.8"
// spark library dependencies
// change this to 3.0.0 when released
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.1",
  "org.apache.spark" %% "spark-sql"  % "3.2.1"
)
