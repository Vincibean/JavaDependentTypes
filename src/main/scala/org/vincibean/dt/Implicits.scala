package org.vincibean.dt

import com.example.tutorial.AddressBookProtos.Person

object Implicits {

  trait Dep[T, R] {
    def dep(t: T): R
  }

  implicit val personDep = new Dep[Person, Person.Builder] {
    def dep(p: Person): Person.Builder = Person.newBuilder()
  }

}
