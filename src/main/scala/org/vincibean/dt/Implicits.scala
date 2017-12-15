package org.vincibean.dt

import com.example.tutorial.AddressBookProtos.Person

object Implicits {

  trait Aux[T, R] {
    def dep(t: T): R
  }

  implicit val personAux = new Aux[Person, Person.Builder] {
    def dep(p: Person): Person.Builder = Person.newBuilder()
  }

}
