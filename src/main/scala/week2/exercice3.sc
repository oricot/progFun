import scala.math.abs

object exercice3 {

  def averageDamp(f: Double => Double ) (x: Double ) = (x+f(x))/2

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

  def sqrt(x:Int ) = fixedPoint(averageDamp(y=>x/y))(x)
  sqrt(2)
}