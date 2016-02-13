package controllers

import play.api.mvc._
import models.{User, Users}
import play.api.data._
import play.api.data.Forms._
import play.api.i18n.Messages

object Application extends Controller {

  val userForm = Form(
    mapping(
      "id" -> number,
      "name" -> nonEmptyText,
      "description" -> nonEmptyText
    )(User.apply)(User.unapply)
  )

  /**
   *  Users List.
   */
  def index = Action { implicit request =>
    Ok(views.html.index(Users.findAll))
  }

  /**
   * Inserts a user.
   */
  def insert() = Action { implicit request =>
    userForm.bindFromRequest.fold(
      form => {
        BadRequest(views.html.details(None, form))
      },
      user => {
        Users.insert(user)
        Redirect(routes.Application.index).flashing("success" -> Messages("user has been inserted", user.name))
      }
    )
  }

  /**
   * Blank form for a new user.
   */
  def blank = Action { implicit request =>
    Ok(views.html.details(None, userForm))
  }
}
