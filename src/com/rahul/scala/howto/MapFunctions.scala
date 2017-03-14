package com.rahul.scala.howto

object MapFunctions {
  def main(args: Array[String]): Unit = {
    var map = Map("rahul" -> 26, "shreya" -> 24)
    map += ("bhoomika" -> 24)
    map -= "shreya"

    for ((k, v) <- map) {
      println(k + ":" + v)
    }
  }
}
