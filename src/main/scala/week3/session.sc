def sumOld(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, acc+f(a))
  }
  loop(a, 0)
}





def sum(f: Int => Int):(Int, Int) => Int = {
  def loop(a: Int, b: Int): Int = {
    if (a>b) 0
    else f(a) + loop(a+1,b)
  }
  loop
}

//def sumcubs = sumOld(x=>x, a : Int  ,b : Int)

sum(x=>x)(2,4) //  Sum 2+3+4
sum(x=>x*x*x) (2,4) // sum 2*2*2 + 3*3*3+ 4*4*4
