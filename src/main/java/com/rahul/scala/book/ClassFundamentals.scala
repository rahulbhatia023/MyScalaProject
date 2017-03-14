package com.rahul.scala.book

class ClassFundamentals {
  private var sum = 0

  def add(b: Byte) {
    sum += b
  }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ClassFundamentals {
  def main(args: Array[String]): Unit = {
    val classFundamentalsObject = new ClassFundamentals
    classFundamentalsObject.add(2)
    println(classFundamentalsObject.checksum())
  }
}
