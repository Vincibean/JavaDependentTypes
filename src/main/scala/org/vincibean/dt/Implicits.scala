package org.vincibean.dt

import com.example.tutorial.AddressBookProtos.{AddressBook, Person}

object Implicits {

  trait Aux[T, R] {
    def dep: R
  }

  implicit val personAux = new Aux[Person, Person.Builder] {
    def dep: Person.Builder = Person.newBuilder()
  }

  implicit val addressBookAux = new Aux[AddressBook, AddressBook.Builder] {
    def dep: AddressBook.Builder = AddressBook.newBuilder()
  }

}
