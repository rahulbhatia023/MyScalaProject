package com.rahul.scala.etlhive

object Factorial extends App {
  println("Enter number: ")
  val number = scala.io.StdIn.readInt()
  val factorial = findFactorial(number)

  println("Factorial of %d is: %d".format(number, factorial))

  def findFactorial(number: Int): Int = {
    if (number == 0) 1
    else number * findFactorial(number - 1)
  }
}