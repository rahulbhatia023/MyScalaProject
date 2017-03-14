package com.rahul.scala.book

object ArrayFundamentals {
  def main(args: Array[String]): Unit = {
    val students: Array[String] = new Array[String](3)
    students(0) = "Rahul"
    students.update(1, "Shreya") // equivalent of 'students(1) = "Shreya"'
    students(2) = "Bhoomika"

    for (i <- 0.to(2)) /* equivalent of "for(i <- 0 to 2)" */ {
      println(students.apply(i)) // equivalent of "students(i)"
    }

    val colours = Array.apply("Red", "Blue", "Green") // equivalent of "Array("Red", "Blue", "Green")"
    colours.foreach(println)
  }
}