object ForLoopFundamentals extends App {
  val filesList = Array("abc.scala", "def.txt", "ghi.png", "jkl.scala")

  println("Scala Files: ")
  for (file <- filesList
       if (file.endsWith("scala"))) {
    println(file)
  }

  println("Non Scala Files: ")
  val notScalaFiles =
    for (file <- filesList
         if (!file.endsWith("scala"))) yield {
      file
    }
  for (notScalaFile <- notScalaFiles) {
    println(notScalaFile)
  }
}
