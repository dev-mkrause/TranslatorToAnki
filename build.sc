import $ivy.`com.goyeau::mill-scalafix::0.2.9`
import com.goyeau.mill.scalafix.ScalafixModule
import mill._, scalalib._, scalafmt._

object main extends ScalaModule with ScalafixModule {
  def scalaVersion = "3.2.2"


object test extends Tests with TestModule.Munit {
  def ivyDeps =
    Agg(
      ivy"org.scalameta::munit::0.7.29"
    )
  }
}
