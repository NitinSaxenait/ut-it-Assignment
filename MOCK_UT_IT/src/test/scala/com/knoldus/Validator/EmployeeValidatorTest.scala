package com.knoldus.Validator

import com.knoldus.db.EmployeeReadDto
import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.AsyncFlatSpec

class EmployeeValidatorTest extends AsyncFlatSpec {
  val employeeReadDto = new EmployeeReadDto
  val emailValidator = new EmailValidator
  val employeeValidator = new EmployeeValidator
  val employeeImpl = new EmployeeImpl(employeeValidator)

  val wiproEmployee: Employee = Employee("Raju", "TT", 30,50000.00,"Software Trainee","Wipro","niklaus@wipro.com")
  val tcsEmployee: Employee = Employee("Kesav", "Sharma", 30,30000.00,"Software Trainee","Tcs","tcstcs")

  "Employee" should "return: company is invalid" in{
    val result = employeeValidator.employeeIsValid(wiproEmployee)
    assert(result)
  }

  it should "return: email id and company is invalid" in{
    val result = employeeValidator.employeeIsValid(tcsEmployee)
    val emailValid=emailValidator.emailIdIsValid(tcsEmployee.emailId)
    assert(result && !emailValid)
  }



}
