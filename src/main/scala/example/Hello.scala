package example

import play.api._
import play.api.mvc._
import play.core.server._
import com.example.foo._

object Example extends App {
  val components = new AkkaHttpServerComponents with BuiltInComponents {
    override lazy val serverConfig: ServerConfig = ServerConfig()
    override lazy val httpFilters = Nil
    override lazy val router =
      new Routes(httpErrorHandler, new _root_.controllers.MyController())
  }
  val server = components.server
}
