package com.rahul.scala.howto

object ListIteration {
  def main(args: Array[String]): Unit = {
    val list = List(2, 4, 6, 8, 10)

    println("Iteration Method: 1")
    for (element <- list) {
      println(element)
    }

    println("Iteration Method: 2")
    list.foreach {
      println
    }

    println("Iteration Method: 3")
    list.foreach {
      println(_)
    }

    println("Iteration Method: 4")
    list.foreach {
      element: Int => println(element)
    }
  }
}
