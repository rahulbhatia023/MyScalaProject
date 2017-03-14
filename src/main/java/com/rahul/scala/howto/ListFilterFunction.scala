package com.rahul.scala.howto

object ListFilterFunction {
  def main(args: Array[String]): Unit = {
    val list1 = List.range(0, 100)
    val list2 = list1.filter(even)
    val list3 = list1.filter(element => element % 2 != 0)
    val list4 = list1.filter(_ % 5 == 0)

    println("List: 1")
    list1.foreach {
      println
    }

    println("List: 2")
    list2.foreach {
      println
    }

    println("List: 3")
    list3.foreach {
      println
    }

    println("List: 4")
    list4.foreach {
      println
    }
  }

  def even(element: Int): Boolean = {
    if (element % 2 == 0)
      return true
    return false
  }
}
