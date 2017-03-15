package com.rahul.scala.book

object Closures extends App {
  var more = 10

  val functionLiteral1 = (x: Int) => x + more

  println(functionLiteral1(20))

  more = 20
  
  println(functionLiteral1(20))

  val list = List(1, 2, 3, 4, 5)

  var sum = 0

  list.foreach(sum += _)
  println(sum)
}
