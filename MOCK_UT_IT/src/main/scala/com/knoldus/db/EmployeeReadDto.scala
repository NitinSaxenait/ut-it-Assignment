package com.knoldus.db

import com.knoldus.models.{Company, Employee}

import scala.collection.immutable.HashMap

class EmployeeReadDto {


  val knoldusEmployee: Employee = Employee("Nitin", "Saxena", 21,15000,"Intern","Knoldus","saxenasamar604.com")
  val philipsEmployee: Employee = Employee("Ram", "Singh", 23,30000,"Developer","Philips","Ram@gmail.com")
  val employees: HashMap[String, Employee] = HashMap("Nitin" -> knoldusEmployee, "Ram" -> philipsEmployee)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)



}
