package com.rahul.scala.etlhive

object Factorial extends App {
  println("Enter number: ")
  val number = scala.io.StdIn.readInt()

  var factorial = 1
  for (i <- number to 1 by -1) {
    factorial = factorial * i
  }
  println("Factorial of %d is: %d".format(number, factorial))
}
