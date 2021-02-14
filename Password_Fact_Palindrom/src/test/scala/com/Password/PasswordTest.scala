package com.Password

import com.Fact_Palindrom.Fact_Palindrom
import org.scalatest.AsyncFlatSpec;

class PasswordTest extends AsyncFlatSpec {

  "Password" should "Valid" in {


    assert(Password.PasswordValidator("Nitin@123"))


  }
  "String" should "Plaindrom" in {
    assert(Fact_Palindrom.Palindrom("121"))
  }



  "String" should "not Plaindrom" in {
    assert(!Fact_Palindrom.Palindrom("124"))
  }

}
