import mill._, scalalib._, scalafmt._

object main extends ScalaModule {
  def scalaVersion = "3.2.2"


object test extends Tests with TestModule.Munit {
  def ivyDeps =
    Agg(
      ivy"org.scalameta::munit::0.7.29"
    )
  }
}
