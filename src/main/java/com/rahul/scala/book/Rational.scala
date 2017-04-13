package com.rahul.scala.book

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numerator: Int = n
  val denominator: Int = d

  def add(that: Rational): Rational = {
    new Rational(numerator * that.denominator + that.numerator * denominator, that.denominator)
  }

  def lessThan(that: Rational): Boolean = numerator * that.denominator < that.numerator * denominator

  def max(that: Rational): Rational = if (lessThan(that)) that else this

  override def toString: String = numerator + "/" + denominator
}

object yRational {
  def main(args: Array[String]): Unit = {
    val rationalNumber = new Rational(1, 2)
    val newRationalNumber = rationalNumber.add(new Rational(3, 4))

    println(newRationalNumber)
  }
}