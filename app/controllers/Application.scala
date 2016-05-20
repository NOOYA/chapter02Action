package controllers

import play.api.mvc._
import models._

object Application extends Controller {
  // Actionは関数
  def index = Action {
    Ok(views.html.main)
  }

  def listArtist = Action{
  	Ok(views.html.home(Artist.fetch))
  }
}
