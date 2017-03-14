package com.rahul.scala.book

object PatternMatching extends App {
  val numeric = 2

  println(numeric match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
  })
}
