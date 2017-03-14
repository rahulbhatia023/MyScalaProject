"Hello World"

var a = 10

var b: Int = 10

a + b

var firstName = "Rahul"

var lastName: String = "Bhatia"

println(a.+(b))

case class Student(var rollNo: Int = 1, var name: String = "ABC", var marks: Int = 0) {
  def show() = {
    println("Roll Number: " + rollNo)
    println("Name: " + name)
    println("Marks: " + marks)
  }

  def >(student: Student) = marks > student.marks
}

var student = Student(23, "Shreya", 90)
student.show()

var shreya = Student(69, "Shreya", 80)
var rahul = Student(23, "Rahul", 90)

println(shreya > rahul)


var numbers = List(2, 4, 6, 8)
numbers.foreach { num: Int => println(num) }

var oddNumbers = List(1, 3, 5, 7)
var reverseOddNumbers = oddNumbers.reverse

oddNumbers.foreach { num => println(num) }
reverseOddNumbers.foreach { num => println(num) }

var takeList = oddNumbers take 2