package controllers

import com.github.mmizutani.playgulp.GulpAssets
import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

/**
  * Add your spec here.
  * You can mock out a whole application including requests, plugins etc.
  *
  * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
  */
class ApplicationControllerSpec
    extends PlaySpec
    with GuiceOneAppPerTest
    with Injecting {

  "ApplicationController GET" should {

    // FIXME
//    "render the oldhome page from a new instance of controller" in {
//      val controller = new ApplicationController(stubControllerComponents())
//      val home = controller.oldhome().apply(FakeRequest(GET, "/oldhome"))
//
//      status(home) mustBe OK
//      contentType(home) mustBe Some("text/html")
//      contentAsString(home) must include("Welcome to Play")
//    }

    "render the oldhome page from the application" in {
      val controller = inject[ApplicationController]
      val home = controller.oldhome().apply(FakeRequest(GET, "/oldhome"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include("Welcome to Play")
    }

    "render the oldhome page from the router" in {
      val request = FakeRequest(GET, "/oldhome")
      val home = route(app, request).get

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include("Welcome to Play")
    }
  }
}
