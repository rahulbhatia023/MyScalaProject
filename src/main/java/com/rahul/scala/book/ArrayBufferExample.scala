package com.rahul.scala.book

import scala.collection.mutable.ArrayBuffer

object ArrayBufferExample extends App {
  val arrayBuffer = new ArrayBuffer[Int]()
  arrayBuffer += 1
  arrayBuffer += 2
  arrayBuffer += 3
  arrayBuffer += 4
  arrayBuffer += 5

  (arrayBuffer.toArray).foreach {
    println
  }
}
