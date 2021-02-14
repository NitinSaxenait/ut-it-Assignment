package com.knoldus.request
import com.knoldus.db.UserReadDto
import com.knoldus.models.{Company, User}
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.AsyncFlatSpec
class UserImplIntegrationTest extends  AsyncFlatSpec {


  val userReadDto = new UserReadDto
  val emailValidator = new EmailValidator
  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)



  "User" should "exist" in {
    val NitinEmployee: User = User("Nitin", "Saxena", 21,"Knoldus" , "saxenasamar604@gmail.com")
    val result =  userImpl.createUser(NitinEmployee)
    var  valid = emailValidator.emailIdIsValid(NitinEmployee.emailId)
    assert(result==Some("saxenasamar604@gmail.com") && valid)
  }

  it should "be invalid as company does not exist" in {
    val klausEmployee: User = User("Klaus","Mickelson",30,"Wipro","niklaus@wipro.com")
    val result =  userImpl.createUser(klausEmployee)
    var  valid = emailValidator.emailIdIsValid(klausEmployee.emailId)
    assert(!result.isEmpty && valid)
  }
}