package models


/**
 *  User Case Class .
 *
 */
case class User(id: Int,name: String, description: String)


object Users {

def insert(user:User) ={
  
//Put your code to store user in any Database
  
}


def findAll={
List(User(2322,"Akshay","Play Microservices"))
}
}
