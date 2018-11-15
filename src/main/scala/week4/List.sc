//import week4.Cons
//import week4.List
//import week4.Nil
import week4._

object List {

  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

  singleton(1)

  singleton[Boolean](true)

  def nth[T](number: Int, list: List[T]): T =
    if (list.isEmpty) throw new IndexOutOfBoundsException("Illegal index") else
  if (number != 0) nth(number - 1,      list.tail ) else list.head
  //if (!(list.isEmpty)) list.tail else throw new IndexOutOfBoundsException("Illegal index")) else list.head
//if (number==0) list.head
//else nth(number - 1, list.tail )
  // indexOutOfBoundsException

  val ll3 = new Cons(1,new Cons(2, new Cons(3, new Nil)))
  val ll = new Cons (15, new Nil)

  val ll2 = new Cons (150, ll)

  println(nth (0, ll3))
  println(nth (1, ll3))
  println(nth (3, ll3))

  println(nth (-2, ll2))
}



