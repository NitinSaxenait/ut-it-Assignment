package com.knoldus.db
import org.scalatest.AsyncFlatSpec

class EmployeeReadDtoTest extends AsyncFlatSpec {
  "Employee's company" should "be present" in {
    val employeeReadDto = new EmployeeReadDto
    val result = employeeReadDto.getEmployeeByName("Nitin")
    assert(result!=None)
  }

  it should "not be present" in {
    val employeeReadDto = new EmployeeReadDto
    val result = employeeReadDto.getEmployeeByName("Arun")
    assert(result==None)
  }
}
