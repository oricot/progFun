//package Week1
object session {

  1+5
  def abs(x : Double) : Double = if (x <0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improveIter(guess, x), x)

    def isGoodEnough(guess : Double, x : Double) =
      abs(guess*guess - x)/x < 0.001

    def improveIter(guess : Double, x : Double)  =
      (guess + x / guess) / 2


  println(sqrtIter(1, 2))
  println(sqrtIter(1, 0.1e-20))
  println(sqrtIter(1, 1.0e20))
  println(sqrtIter(1, 1.0e50))

}