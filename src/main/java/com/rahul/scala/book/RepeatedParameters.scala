package com.rahul.scala.book

object RepeatedParameters extends App {
  def echo(args: String*): Unit = {
    for (arg <- args) {
      println(arg)
    }
  }

  echo("Rahul")
  echo("Rahul", "Bhatia")

  val array = Array("A", "B", "C", "D")
  echo(array: _*)
}
