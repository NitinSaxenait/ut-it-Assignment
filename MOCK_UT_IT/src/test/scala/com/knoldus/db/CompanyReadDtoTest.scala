package com.knoldus.db

import org.scalatest.AsyncFlatSpec

class CompanyReadDtoTest extends  AsyncFlatSpec{

  "Company" should "exist" in {
    val companyReadDto = new CompanyReadDto
    val result = companyReadDto.getCompanyByName("Knoldus")
    assert(result.isDefined)
  }

  it should "not exist" in {
    val companyReadDto = new CompanyReadDto
    val result = companyReadDto.getCompanyByName("Ksolve")
    assert(result.isEmpty)
  }


}
