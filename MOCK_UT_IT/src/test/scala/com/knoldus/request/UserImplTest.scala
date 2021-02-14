package com.knoldus.request
import com.knoldus.db.UserReadDto
import com.knoldus.models.{Company, User}
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.AsyncFlatSpec

class UserImplTest extends AsyncFlatSpec {

  val mockedUserValidate: UserValidator = mock[UserValidator]
  val nitinUser: User = User("Nitin","Saxena",23,"knoldus","nitin.saxena@knoldus.com")
  val ramUser: User = User("Ram","Singh",23,"knoldus","Ram@knoldus.com")
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")

  "User" should "be valid" in {

    val userImpl = new UserImpl(mockedUserValidate)
    when(mockedUserValidate.userIsValid(nitinUser)) thenReturn true
    val result = userImpl.createUser(nitinUser)
    assert(result.isDefined)
  }

  "User" should "be not valid" in {

    val userImpl = new UserImpl(mockedUserValidate)
    when(mockedUserValidate.userIsValid(ramUser)) thenReturn false
    val result = userImpl.createUser(ramUser)
    assert(result.isEmpty)
  }



}
