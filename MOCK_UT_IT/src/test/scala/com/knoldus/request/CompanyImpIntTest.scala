package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.AsyncFlatSpec

class CompanyImplIntegrationTest extends AsyncFlatSpec {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator
  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  "Company" should "not get created as it already exists" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val result =  companyImpl.createCompany(knoldusCompany)
    var valid =emailValidator.emailIdIsValid(knoldusCompany.emailId)
    assert(result==Some("Knoldus") && valid)
  }

  it should "not get created as email id is invalid" in {
    val knoldusCompany: Company = Company("Knoldus", "abc.com", "Noida")
    val result =  companyImpl.createCompany(knoldusCompany)
    var valid =emailValidator.emailIdIsValid(knoldusCompany.emailId)

    assert(result==Some("Knoldus") && !valid)
  }

  it should "not get created as email id is invalid and company already exists" in {
    val knoldusCompany: Company = Company("Knoldus", "gmail.inc", "Noida")
    val result =  companyImpl.createCompany(knoldusCompany)

    var valid =emailValidator.emailIdIsValid(knoldusCompany.emailId)
    assert(result==Some("Knoldus") && !valid)
  }

  "Company" should "get created" in {
    val KsolveCompany: Company = Company("Ksolve", "Ksolve@gmail.com", "Noida")
    val result =  companyImpl.createCompany(KsolveCompany)
    var valid =emailValidator.emailIdIsValid(KsolveCompany.emailId)
    assert(result==None && valid)
  }
}

