package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company


class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val obj = new CompanyReadDto
    val x:Option[Company] = obj.getCompanyByName(company.name)
    if(x.isEmpty)
      false
    else
      true





  }

}
