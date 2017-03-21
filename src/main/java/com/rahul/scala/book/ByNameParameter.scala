package com.rahul.scala.book

object ByNameParameter extends App {
  var assertionsEnabled: Boolean = true

  def myAssert(predicate: => Boolean) = {
    if (assertionsEnabled && !predicate) {
      throw new AssertionError()
    }
  }

  myAssert(5 < 3)
}
