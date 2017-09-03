package com.rahul.scala.etlhive

object SequenceExample extends App {
  val c = Seq(1, 3, 2)
  val d = Seq('a', 'b', 'c')

  val e = for {
    n <- c
    m <- d
  } yield (n, m)
  println(e)
}
