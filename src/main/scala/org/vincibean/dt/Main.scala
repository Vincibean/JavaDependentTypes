package org.vincibean.dt

import com.example.tutorial.AddressBookProtos.Person
import com.google.protobuf.GeneratedMessageV3
import org.vincibean.dt.Implicits._

object Main extends App {

  val p = Person.newBuilder().setName("Anakin Skywalker").setId(12).build()
  magicHappens[Person, Person.Builder](p, _.setId(12).setName("Darth Vader"))

  def magicHappens[T <: GeneratedMessageV3, R <: Person.Builder](t: T, hook: R => R)(implicit ev: Aux[T, R]): Unit = {
    val res = hook(ev.dep(t)).build()
    println(res)
  }

}
