package com.rahul.scala.etlhive

class AdditionExample {
  def add(a: Int, b: Int): Unit = {
    println("Sum is: " + (a + b))
  }
}

object AdditionExample extends App {
  println("Enter the value of a: ")
  val a: Int = scala.io.StdIn.readInt()

  println("Enter the value of b: ")
  val b: Int = scala.io.StdIn.readInt()

  val myScalaClass = new AdditionExample
  myScalaClass.add(a, b)
}
