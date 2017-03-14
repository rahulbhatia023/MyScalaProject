package com.rahul.scala.book

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    println(fun())
  }

  def fun(): Int = {
    val a = 5
    val b = 0
    try {
      val c = a / 5
      c
    }
    catch {
      case ex: ArithmeticException => 0
      case ex: Exception => 0
    }
    finally {
      println("In finally block")
      return 2
    }
  }
}
