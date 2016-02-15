package models


/**
  * User object .
  *
  */
case class User(id: Int, name: String, description: String)


object Users {

  /**
    * Insert new user
    *
    * @param user
    */
  def insert(user: User): User = {
    //TODO: Put your code to store user in any Database
    user
  }


  /**
    * Fetch all user list
    *
    * @return
    */
  def list: List[User] = {
    //TODO: Put your code to fetch data from database
    List(User(2000, "Akshay", "Play"), User(2001, "Anand", "Spark"), User(2002, "Supriya", "Spark-GraphX"),
      User(2003, "Himanshu", "Elastic Search"))
  }
}
