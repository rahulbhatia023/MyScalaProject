package com.rahul.scala.etlhive

class MyScalaClass {
  def add(a: Int, b: Int): Unit = {
    println("Sum is: " + (a + b))
  }
}

object MyScalaClass extends App {
  println("Enter the value of a: ")
  val a: Int = scala.io.StdIn.readInt()

  println("Enter the value of b: ")
  val b: Int = scala.io.StdIn.readInt()

  val myScalaClass = new MyScalaClass
  myScalaClass.add(a, b)

  //Sequence
  val c = Seq(1, 3, 2)
  val d = Seq('a', 'b', 'c')

  val e = for {
    n <- c
    m <- d
  } yield (n, m)
  println(e)
}
