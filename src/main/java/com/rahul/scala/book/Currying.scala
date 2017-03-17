package com.rahul.scala.book

object Currying extends App {
  def curriedSum(x: Int)(y: Int) = x + y

  println(curriedSum(1)(2))

  val sum1 = curriedSum(1)(_)

  println(sum1(2))

  val sum2 = curriedSum(_: Int)(_: Int)

  println(sum2(1, 2))
}
