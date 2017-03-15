package com.rahul.scala.book

object DefaultParameterValues extends App{
  def speed(distance: Float = 100, time: Float = 10): Float = distance / time

  println(speed(90, 8))
  println(speed(distance = 85, time = 5))
  println(speed(time = 6, distance = 70))
  println(speed())
}

