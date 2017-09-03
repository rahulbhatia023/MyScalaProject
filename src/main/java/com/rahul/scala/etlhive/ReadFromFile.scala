package com.rahul.scala.etlhive

import scala.io.Source

object ReadFromFile extends App {
  val filePath = "/home/rahul/Softwares/hadoop-2.8.0/data/employee.txt"
  val lines = Source.fromFile(filePath).getLines()

  var counter = 1
  for (line <- lines) {
    println("Line %d: %s".format(counter, line))
    counter = counter + 1
  }
}
