package com.rahul.scala.howto

object MutableMap {
  def main(args: Array[String]): Unit = {
    var map = scala.collection.mutable.Map("rahul" -> 26, "shreya" -> 24)
    map("rahul") = 27

    for ((k, v) <- map) {
      println(k + ":" + v)
    }
  }
}
