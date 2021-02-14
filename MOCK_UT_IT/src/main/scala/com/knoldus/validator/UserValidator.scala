package com.knoldus.validator

import com.knoldus.db.{EmployeeReadDto, UserReadDto}
import com.knoldus.models.{Employee, User}

class UserValidator {
  def userIsValid(user: User): Boolean = {
    val obj = new UserReadDto
    val x:Option[User] =obj.getUserByName(user.emailId)
    if(x.isEmpty)
      true
    else
      false
  }

}
