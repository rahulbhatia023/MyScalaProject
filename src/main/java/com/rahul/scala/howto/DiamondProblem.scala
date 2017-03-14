package com.rahul.scala.howto

trait One {
  def display() {
    println("One")
  }
}

trait Two extends One {
  override def display() {
    println("Two")
  }
}

trait Three extends One {
  override def display() {
    println("Three")
  }
}

class DiamondClass extends Two with Three

object DiamondProblem {
  def main(args: Array[String]) {
    var diamondClass: DiamondClass = new DiamondClass
    diamondClass.display()
  }
}
