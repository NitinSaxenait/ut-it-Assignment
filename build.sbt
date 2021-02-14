name := "Assignment_OF_UT_IT"

version := "0.1"

scalaVersion := "2.13.4"


lazy val password = project.in(file("Password_Fact_Palindrom")).settings(
  libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test",
    "org.mockito" %% "mockito-scala" % "1.5.12" % "test")
)



lazy val mock_UT_IT = project.in(file("MOCK_UT_IT")).settings(
  libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test",
    "org.mockito" %% "mockito-scala" % "1.5.12" % "test")
)



lazy val Assignment_OF_UT_IT = (project in file(".")).aggregate(password,mock_UT_IT)