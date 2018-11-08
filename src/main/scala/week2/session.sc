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

def sumCubs(a:Int, b:Int) = sumOld(x=>x * x * x )( a , b)
def sumCubsNew = sum(x=>x*x*x)
sum(x=>x)(2,4) //  Sum 2+3+4
sum(x=>x*x*x) (2,4) // sum 2*2*2 + 3*3*3+ 4*4*4
sumCubs(2,4)
sumCubsNew(2,4)

def cube(a:Int) : Int =a*a*a
sum(cube) (1,10)

sum(cube)


def sum3(f: Int => Int)(a: Int, b: Int): Int =
    if (a>b) 0
    else f(a) + sum3(f)(a+1, b)

sum3(cube) (1,10)

// sum3 (cube)
//sumOld(cube)



def product(f: Int=> Int) (a:Int, b: Int): Int =
  if (a>b) 1
  else f(a) * product(f) (a+1,b)

sum3(x=>x) (1,2)

product(x=>x) (1,3)













