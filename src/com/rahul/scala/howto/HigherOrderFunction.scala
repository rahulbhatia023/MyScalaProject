package com.rahul.scala.howto

object HigherOrderFunction {

  def performMultiplication(function: (Int, Int) => Int) {
    println(function(2, 3))
  }

  def main(args: Array[String]) {
    performMultiplication((x: Int, y: Int) => x * y)
  }

}
