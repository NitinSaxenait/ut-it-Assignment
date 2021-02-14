package com.Fact_Palindrom

import com.Interface.Fact_Palindrom_Trait

object Fact_Palindrom extends Fact_Palindrom_Trait {


  override def Factorial(num: Int): Unit = {
    var f = 1
    for (i <- 1 to num) {
      f = f * i
    }
    println("The Factorial Of a number is: " + f)
  }


  override def Palindrom(s: String): Boolean = {
    val t=s.reverse
    if(t.equals(s))
    {
      return true;
    }
    else
    {
      return  false;
    }
  }

}
