package week3

class Rational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")

  def this(x: Int) = this(x, 1)

  def numer = x

  def denom = y

  def <(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this.<(that)) that else this

  def +(that: Rational) =
    new Rational(numer * that.denom + denom * that.numer, denom * that.denom)

  def unary_- = new Rational(0 - numer, denom)

  def -(that: Rational) = {
    this + -that

  }

  override def toString = {
    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    numer / gcd(numer, denom) + "/" + denom / gcd(numer, denom)
  }


  def makeString(r: Rational) =
    r.numer + "/" + r.denom
}


