package com.knoldus.validator

import com.knoldus.db.{EmployeeReadDto}
import com.knoldus.models.{Company, Employee}

class EmployeeValidator {


  def employeeIsValid(employee: Employee): Boolean = {
    val obj = new EmployeeReadDto
    val x:Option[Employee] =obj.getEmployeeByName(employee.emailId)
    if(x.isEmpty)
      true
    else
      false
  }
}
