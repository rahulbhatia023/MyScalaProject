package com.rahul.scala.howto

object ListFunctions {
  def main(args: Array[String]): Unit = {
    val list1 = List.range(1, 10)
    val list2 = List.tabulate(10) { element => element * element }
    val list3 = List.fill(10) {
      5
    }
    val list4 = list1 ::: list2 ::: list3

    println("List: 1")
    for (element <- list1) {
      println(element)
    }
    println("List: 2")
    for (element <- list2) {
      println(element)
    }
    println("List: 3")
    for (element <- list3) {
      println(element)
    }
    println("List: 4")
    for (element <- list4) {
      println(element)
    }
  }
}
