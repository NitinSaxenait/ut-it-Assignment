package com.knoldus.validator

class EmailValidator {
  def emailIdIsValid(emailId: String): Boolean = emailId.matches("^\\S+@\\S+\\.(com|net|org)$")
}
