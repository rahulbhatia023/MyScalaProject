object SquareRootExample {
  def abs(x: Double): Double = if (x < 0) -x else x

  def squareRoot(x: Double): Double = {
    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    sqrtIter(1.0)
  }

  squareRoot(4)
}