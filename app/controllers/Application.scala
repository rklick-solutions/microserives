package controllers

import models.{User, Users}
import play.api.data.Forms._
import play.api.data._
import play.api.i18n.Messages
import play.api.mvc._

object Application extends Controller {

  /**
    * user form
    */
  val userForm = Form(
    mapping(
      "id" -> number,
      "name" -> nonEmptyText,
      "description" -> nonEmptyText
    )(User.apply)(User.unapply))

  /**
    * Users List.
    */
  def list = Action { implicit request =>
    Ok(views.html.users(Users.list))
  }

  /**
    * Insert a new user.
    */
  def insert() = Action { implicit request =>
    userForm.bindFromRequest.fold(
      form => BadRequest(views.html.createForm(form)),
      user => {
        Users.insert(user)
        Redirect(routes.Application.list).flashing("success" -> Messages("user has been inserted", user.name))
      }
    )
  }

  /**
    * Display the new user form
    */
  def create = Action { implicit request =>
    Ok(views.html.createForm(userForm))
  }
}
