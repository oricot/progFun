import java.security.KeyStore.TrustedCertificateEntry

import org.omg.CORBA.DynAnyPackage.Invalid

object Nat4 extends App {


}


abstract class Nat {
  def isZero: Boolean

  def predecessor: Nat

  def successor: Nat = new Succ(this)

  def +(that: Nat): Nat

  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true

  def predecessor = throw new Error("No predecessor for Zero")


  def +(that: Nat) = that

  def -(that: Nat) = if (that.isZero) this else throw new Error("No negative value for Nat")
}

class Succ(n: Nat) extends Nat {

  def isZero = false

  def predecessor = n

  def +(that: Nat): Nat =  new Succ(n + that)

  def -(that: Nat): Nat =   n - that.predecessor
}