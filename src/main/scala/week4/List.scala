package week4

import java.util.NoSuchElementException

trait List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]

}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true

  def head: Nothing = throw new NoSuchElementException("Nil.Head")

  def tail: Nothing = throw new NoSuchElementException("Nil.Tail")

}

object List {
  def List() = new Nil[T]//the empty list

  def List(length : Int) //the list with single element 1.

  def List(start : Int, end : Int) // the list with elements 2 and 3
}

class EmptyList {
  def List() = new List2 {}

}


