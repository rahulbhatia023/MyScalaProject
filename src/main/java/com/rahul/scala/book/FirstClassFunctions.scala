package com.rahul.scala.book

object FirstClassFunctions {
  def main(args: Array[String]): Unit = {
    val firstClassFunction1 = (x: Int) => x + 10
    println("firstClassFunction1(5): " + firstClassFunction1(5))

    val firstClassFunction2 = (_: Int) + 10
    println("firstClassFunction2(5): " + firstClassFunction2(5))

    val firstClassFunction3 = (x: Int, y: Int) => x + y
    println("firstClassFunction3(5, 10): " + firstClassFunction3(5, 10))

    val firstClassFunction4 = (_: Int) + (_: Int)
    println("firstClassFunction4(5, 10): " + firstClassFunction4(5, 10))
  }
}
