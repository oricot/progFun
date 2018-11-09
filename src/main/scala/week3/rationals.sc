object rationals {

  val x = new Rational(1, 3)

  val y = new Rational(5, 7)

  x.numer
  x.denom

  val z = new Rational(3, 2)

  (x + y).toString


  print("sub :")


  println((x - y - z).toString)


  y + y

  x-x+y-y

  x < y

  println("mod")


  //val strange = new Rational (1,0)

  //strange.add(strange)


  class Rational(x: Int, y: Int) {
    require(y > 0, "denominator must be positive")

    def this(x: Int) = this(x, 1)


    //    def numer = x / gcd(x, y)
    //    def denom = y / gcd(x, y)


    def numer = x

    def denom = y

    def <(that: Rational) = numer * that.denom < that.numer * denom

    def max(that: Rational) = if (this.<(that)) that else this

    def +(that: Rational) =
      new Rational(numer * that.denom + denom * that.numer, denom * that.denom)

    def unary_- = new Rational(0 - numer, denom)

    def -(that: Rational) = {
      this + -that
      //new Rational(+(-that).numer, +(-that).denom)
    }

    override def toString = {
      def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

      numer / gcd(numer, denom) + "/" + denom / gcd(numer, denom)
    }
  }


  //  def addRational(r: Rational, s: Rational): Rational =
  //    new Rational(r.numer * s.denom + s.numer*r.denom, r.denom * s.denom)
  //
  def makeString(r: Rational) =
    r.numer + "/" + r.denom

  //makeString(addRational(new Rational (1,2) , new Rational(2,3 )))

}


