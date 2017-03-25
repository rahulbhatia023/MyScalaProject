package com.rahul.scala.book

abstract class Element {
  def contents: Array[Int]

  def length: Int = contents.length
}
