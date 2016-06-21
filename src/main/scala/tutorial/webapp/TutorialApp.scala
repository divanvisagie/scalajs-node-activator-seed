package tutorial.webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js
import js.DynamicImplicits._
import js.Dynamic.{global => g}

val console = g.require("better-console")

object TutorialApp extends JSApp {

  def main(): Unit = {

    console.error("oops")
    println("Hello world!")
  }
}
