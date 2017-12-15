package org.vincibean.dt

import com.example.tutorial.AddressBookProtos.{AddressBook, Person}
import com.google.protobuf.GeneratedMessageV3
import org.vincibean.dt.Implicits._

import scala.language.reflectiveCalls

object Main extends App {

  val p = Person.newBuilder().setName("Anakin Skywalker").setId(12).build()
  magicHappens[Person, Person.Builder](p)(_.setId(12).setName("Darth Vader"))

  val ab = AddressBook.newBuilder().build()
  magicHappens[AddressBook, AddressBook.Builder](ab)(_.addPeople(0, p))

  def magicHappens[T <: GeneratedMessageV3, R <: GeneratedMessageV3.Builder[_] { def build(): T }](t: T)(hook: R => R)(implicit ev: Aux[T, R]): Unit = {
    val res = hook(ev.dep(t)).build()
    println(res)
  }

}
