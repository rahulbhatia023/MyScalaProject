package com.rahul.scala.book

class ArrayElement(val contents: Array[Int]) extends Element

object ArrayElement extends App {
  val arrayElement: Element = new ArrayElement(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  println(arrayElement.length)
}