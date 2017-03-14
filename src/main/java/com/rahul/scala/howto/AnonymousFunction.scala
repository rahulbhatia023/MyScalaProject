package com.rahul.scala.howto

object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    var anonymousFunction1 = () => println("In anonymous function")
    anonymousFunction1()

    var anonymousFunction2 = (x: Int, y: Int) => println(x + y)
    anonymousFunction2(2, 3)

    var anonymousFunction3 = (x: String, y: String) => println(x + y)
    anonymousFunction3("Rahul", "Bhatia")
  }
}
