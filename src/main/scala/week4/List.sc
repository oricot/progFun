//import week4.Cons
//import week4.List
//import week4.Nil
import week4._

object List {

  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])


  singleton(1)

  singleton[Boolean](true)

 // def nth[T](Int, List[T]) : T =

  // indexOutOfBoundsException
}
