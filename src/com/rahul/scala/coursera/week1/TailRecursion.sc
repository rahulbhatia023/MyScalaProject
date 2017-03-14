object TailRecursion {

  def loop(n: Int, i: Int): Int = {
    if (n == 0) i
    else loop(n - 1, i * n)
  }

  def factorial(n: Int): Int = {
    loop(n, 1)
  }

  factorial(4)
}