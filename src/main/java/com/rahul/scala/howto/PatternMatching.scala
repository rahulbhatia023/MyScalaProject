package com.rahul.scala.howto

object PatternMatching {

  def matchPattern(i: Any): Any = {
    i match {
      case 1 => "Integer One"
      case "Rahul" => "String Rahul"
      case 2.5 => "Double 2.5"
    }
  }

  def main(args: Array[String]): Unit = {
    println(matchPattern(2.5))
  }
}
