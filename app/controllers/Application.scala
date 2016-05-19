package controllers

import play.api.mvc._

object Application extends Controller {
// Actionは関数
  def index = Action {
    Ok(views.html.main())
  }

}
