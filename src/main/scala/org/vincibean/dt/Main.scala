package org.vincibean.dt

import org.vincibean.dt.Bar.BarBuilder
import org.vincibean.dt.Foo.FooBuilder
import org.vincibean.dt.Implicits._

object Main extends App {

  magicHappens[Foo, FooBuilder](_.setName("").setNum(12))
  magicHappens[Bar, BarBuilder](_.setId(32).setUsername(""))

  def magicHappens[ T <: HasBuilder[R], R <: Builder[T]](f: R => R)(implicit ev: Dep[T, R]): Unit = {
    val res = f(ev.dep).build()
    println(res)
  }

}
