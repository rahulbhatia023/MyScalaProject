import scala.collection.mutable.ListBuffer

object ListBufferExample extends App {
  val listBuffer = new ListBuffer[Int]
  listBuffer += 1
  listBuffer += 2
  listBuffer += 3
  0 +=: listBuffer

  (listBuffer.toList).foreach {
    println
  }
}