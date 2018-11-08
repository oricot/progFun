object exercise {


  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y)=>(x*y), 1) (a,b)
//    if (a > b) 1
//    else f(a) * product(f)(a + 1, b)

  def fac(a: Int): Int = product(x => x)(1, a)

  product(x=>x)(1,5)

  fac(3)



    def mapReduce(f: Int=> Int, combine: (Int, Int) => Int , zero :Int) (a:Int, b: Int) : Int  = {
      if (a > b) zero // op(0,1)
      else
        combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
    }


}



