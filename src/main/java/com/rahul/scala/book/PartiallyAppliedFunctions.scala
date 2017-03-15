package com.rahul.scala.book

object PartiallyAppliedFunctions extends App {
  def sum(a: Int, b: Int, c: Int): Int = a + b + c

  val x = sum(1, 2, 3)
  println("x: " + x)

  val y = sum _
  println("y(1, 2, 3): " + y(1, 2, 3))

  val z = sum(1, _: Int, 3)
  println("z(2): " + z(2))
}
