package controllers

import play.api.mvc._
import models._
import views._

object Application extends Controller {
  // Actionは関数
//  def index = Action {
//   Ok(views.html.main)
//  }

  def listArtist = Action{
    Ok(views.html.home(Artist.fetch))
  }
  def fetchArtistByName(name:String) = Action{
    Ok(views.html.home(Artist.fetchByName(name)))
  }

  def search(name:String , country:String): Action ={
    var result = Artist.fetchByNameOrCountry(name,country)
    if(result.isEmpty){
      NoContent
    }
    else{
      Ok(views.html.home(result))
    }
  }
}
