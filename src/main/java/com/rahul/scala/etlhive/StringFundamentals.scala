package com.rahul.scala.etlhive

object StringFundamentals extends App {
  println("Enter the string: ")
  val s: String = scala.io.StdIn.readLine()

  val upperCaseString = s.toUpperCase
  val reverseString = s.reverse
  val stringLength = s.length

  println("Upper Case string is: " + upperCaseString)
  println("Reversed string is: " + reverseString)
  println("Length of string is: " + stringLength)
}