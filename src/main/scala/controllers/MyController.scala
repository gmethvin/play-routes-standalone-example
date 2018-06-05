package controllers

import play.api._
import play.api.mvc._
import play.api.libs.streams._
class MyController {
  def myAction = EssentialAction { _ => Accumulator.done(Results.Ok("hello")) }
}
