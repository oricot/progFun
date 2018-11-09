import math.abs


object exercice2 {
  val tolerance = 0.0001
  def isCloseEnough(x: Double, y : Double) =
    abs((x-y)/2)/x < tolerance

  def fixedPoint(f: Double => Double ) ( firstGuess : Double )  = {
    def iterate(guess: Double): Double = {
      println("Guess : " + guess)
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }
  fixedPoint(x=>1 + x/2) (1)

  def sqrt(x: Double ) = fixedPoint(y=>(x+y/y)/2)(1)

  //fixedPoint(y=>2/y)(1.5)

 sqrt(2)
  1

}
