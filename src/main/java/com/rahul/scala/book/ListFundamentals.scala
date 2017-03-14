package com.rahul.scala.book

object ListFundamentals {
  def main(args: Array[String]): Unit = {
    // Concatenation of List
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)

    /*
      Use of Cons operator(::)
    */
    val twoThree = List(2, 3)
    //  we can also write 2 :: 3 :: Nil
    val oneTwoThree = 1 :: twoThree
    // we can also write "val oneTwoThree = twoThree.::(1)"
    println(oneTwoThree)

    /*
      Use of append operator(:+)
     */
    val twoThreeFour = twoThree :+ 4
    println(twoThreeFour)

    /*
      Use of filter functions
     */
    val list1 = List.range(0, 100)
    val list2 = list1.filter(even)
    val list3 = list1.filter(element => element % 2 != 0)
    val list4 = list1.filter(_ % 5 == 0)
    val list5 = List.tabulate(10) { element => element * element }
    val list6 = List.fill(10) {
      5
    }

    println("List: 1")
    list1.foreach {
      println
    }

    println("List: 2")
    list2.foreach {
      println
    }

    println("List: 3")
    list3.foreach {
      println
    }

    println("List: 4")
    list4.foreach {
      println
    }

    println("List: 5")
    list5.foreach {
      println
    }

    println("List: 6")
    list6.foreach {
      println
    }
  }

  def even(element: Int): Boolean = {
    if (element % 2 == 0)
      return true
    false
  }

  /*
    List Iteration methods
   */
  val list = List(2, 4, 6, 8, 10)

  println("Iteration Method: 1")
  for (element <- list) {
    println(element)
  }

  println("Iteration Method: 2")
  list.foreach {
    println
  }

  println("Iteration Method: 3")
  list.foreach {
    println(_)
  }

  println("Iteration Method: 4")
  list.foreach {
    element: Int => println(element)
  }
}
