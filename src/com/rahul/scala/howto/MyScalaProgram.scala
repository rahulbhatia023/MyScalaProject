package com.rahul.scala.howto

trait Shape {
  var x: Int // Abstract Field

  def displayArea()
}

trait Animal {
  var y: Int = 20 // Concrete field

  def makeSound()
}

class CircleBear extends Shape with Animal {
  var x: Int = 10

  def displayArea() {
    println("CircularBear")
  }

  def makeSound() {
    println("Barks")
  }
}

object MyScalaProgram {
  def main(args: Array[String]) {
    // use of "to" keyword in for loop
    for (i <- 1 to 10) {
      println(i)
    }

    // use of "until" keyword in for loop
    for (i <- 1 until 10) {
      println(i)
    }

    // Defining a single dimension array
    val arr: Array[Int] = new Array[Int](3)
    arr(0) = 11
    arr(1) = 12
    arr(2) = 13
    // iteration method: 1 through array
    for (i <- 0 to 2) {
      println(arr(i))
    }
    // iteration method: 2 through array
    for (i <- arr) {
      println(i)
    }

    // Defining a multidimensional array
    val dimArray = Array.ofDim[Int](2, 2)
    dimArray(0)(0) = 14
    dimArray(0)(1) = 15
    dimArray(1)(0) = 16
    dimArray(1)(1) = 17
    for (i <- 0 to 1) {
      for (j <- 0 to 1) {
        print(dimArray(i)(j) + "\t")
      }
      println()
    }

    val circleBear: CircleBear = new CircleBear()
    circleBear.displayArea()
    circleBear.makeSound()
  }
}