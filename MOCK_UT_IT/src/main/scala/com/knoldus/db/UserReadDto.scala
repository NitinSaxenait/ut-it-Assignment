package com.knoldus.db

import com.knoldus.models.{Company, User}

import scala.collection.immutable.HashMap

class UserReadDto {
  val user1: User = User("Nitin","Saxena", 22, "knoldus","saxenasamar604@gmail.com")
  val user2: User = User("Ram","Singh",23,"Google","Ram@gmail.com")
  val users: HashMap[String, User] = HashMap("Nitin" -> user1, "Ram" -> user2)

  def getUserByName(name: String): Option[User] = users.get(name)

}
