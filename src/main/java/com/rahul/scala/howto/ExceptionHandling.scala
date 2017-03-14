package com.rahul.scala.howto

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 0

    try {
      println(a / b)
    }
    catch {
      case ex: ArithmeticException => println("Exception Occured: " + ex.getMessage)
    }
  }
}
