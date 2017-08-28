package com.rahul.scala.etlhive

object Employee extends App {
  println("Enter the name of employee: ")
  val employeeName = scala.io.StdIn.readLine()

  println("Enter the current salary of employee: ")
  val currentSalary = scala.io.StdIn.readDouble()

  val updatedSalary = (new CalculateSalary).calculateUpdatedSalary(currentSalary)
  println("Updated salary of " + employeeName + " is: " + updatedSalary)
}

class CalculateSalary {
  def calculateUpdatedSalary(currentSalary: Double): Double = {
    var incrementPercent: Double = 0
    if (currentSalary <= 5000) incrementPercent = 10
    else if (currentSalary >= 5001 && currentSalary <= 10000) incrementPercent = 7
    else incrementPercent = -5

    currentSalary + (currentSalary * (incrementPercent / 100))
  }
}