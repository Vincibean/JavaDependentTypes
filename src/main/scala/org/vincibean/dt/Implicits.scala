package org.vincibean.dt

import com.example.tutorial.AddressBookProtos.{AddressBook, Person}

object Implicits {

  trait Aux[T, R] {
    def dep(t: T): R
  }

  implicit val personAux = new Aux[Person, Person.Builder] {
    def dep(p: Person): Person.Builder = Person.newBuilder()
  }

  implicit val addressBookAus = new Aux[AddressBook, AddressBook.Builder] {
    def dep(ab: AddressBook): AddressBook.Builder = AddressBook.newBuilder()
  }

}
