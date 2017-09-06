package com.rahul.scala.etlhive

import scala.io.Source

object ReadFromFile extends App {
  val filePath = "/home/rahul/Softwares/hadoop-2.8.0/data/employee.txt"
  val lines = Source.fromFile(filePath).getLines()

  var counterLines = 1
  for (line <- lines) {
    println("Line %d: %s".format(counterLines, line))

    val Array(employeeId, firstName, lastName, age, role, departmentID) = line.split(",")
    println(s"$employeeId, $firstName, $lastName, $age, $role, $departmentID")

    counterLines = counterLines + 1
  }
}
