package com.rahul.scala.book

import scala.util.control.Breaks._

object Breaks {
  def main(args: Array[String]): Unit = {
    breakable {
      for (i <- 1 to 5) {
        println(i)
        if (i == 4) {
          break
        }
      }
    }
  }
}
