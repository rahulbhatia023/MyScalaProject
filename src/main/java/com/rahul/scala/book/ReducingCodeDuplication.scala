package com.rahul.scala.book

import java.io.File

object ReducingCodeDuplication extends App {
  val fileList = new File("/home/rahul/Projects/MyScalaProject/src/main/resources/sample_files").listFiles

  def filesEnding(query: String): Array[File] = {
    filesMatching(_.endsWith(query))
  }

  def filesContaining(query: String): Array[File] = {
    filesMatching(_.contains(query))
  }

  def filesRegex(query: String): Array[File] = {
    filesMatching(_.matches(query))
  }

  private def filesMatching(matcher: (String) => Boolean) = {
    for (file <- fileList
         if matcher(file.getName))
      yield {
        file
      }
  }

  filesEnding(".scala").foreach(println(_))
  filesContaining(".txt").foreach(println(_))
  filesRegex("ghi.jpg").foreach(println(_))
}
