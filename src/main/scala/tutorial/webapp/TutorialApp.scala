package tutorial.webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js
import js.DynamicImplicits._
import js.Dynamic.{global => g}

object TutorialApp extends JSApp {
  val console = g.require("better-console")
  
  def main(): Unit = {
    console.error("oops")
    println("Hello world!")
  }
}
