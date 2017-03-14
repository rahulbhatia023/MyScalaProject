package com.rahul.scala.book

object MapFundamentals {
  def main(args: Array[String]): Unit = {
    var romanValues1 = Map(1 -> "I", 2 -> "II", 3 -> "III") // By default Map is immutable
    romanValues1 += 4 -> "IV"
    println(romanValues1)

    val romanValues2 = scala.collection.mutable.Map(5 -> "V", 6 -> "VI", 7 -> "VII") // This is a mutable map
    romanValues2 += 8 -> "VIII"
    println(romanValues2)
  }
}
