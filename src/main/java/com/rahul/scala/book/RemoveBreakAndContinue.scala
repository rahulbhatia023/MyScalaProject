package com.rahul.scala.book

object RemoveBreakAndContinue {
  def startSearchFrom(i: Int, filesList: Array[String]): Int = {
    if (i >= filesList.length) -1
    else if (filesList(i).startsWith("-")) startSearchFrom(i + 1, filesList)
    else if (filesList(i).endsWith("scala")) i
    else startSearchFrom(i + 1, filesList)
  }

  def main(args: Array[String]): Unit = {
    val filesList = Array("-abc.scala", "-def.txt", "ghi.png", "jkl.scala")
    val index = startSearchFrom(0, filesList)
    println(index)
  }
}
