
  package com.knoldus.db



  import  org.scalatest.AsyncFlatSpec;

  class UserReadDtoTest extends AsyncFlatSpec {

    "User" should "exist" in {

      val userReadDto = new UserReadDto
      val result = userReadDto.getUserByName("Nitin")
      assert(result.isDefined)
    }

    "User" should "not exist" in {

      val userReadDto = new UserReadDto
      val result = userReadDto.getUserByName("Shiv")
      assert(result.isEmpty)
    }
  }

