package com.rahul.scala.book

object SetFundamentals {
  def main(args: Array[String]): Unit = {
    var colours1 = Set("Red", "Blue", "Green") // By default Set is immutable
    colours1 += "Yellow"
    println(colours1)

    val colours2 = scala.collection.mutable.Set("Violet", "Indigo", "Grey") // This Set is a mutable set
    colours2 += "Yellow"
    colours2.+=("Orange") // equivalent of 'colours2 += "Orange"'
    println(colours2)
  }
}
