package org.vincibean.dt

import org.vincibean.dt.Bar.BarBuilder
import org.vincibean.dt.Foo.FooBuilder

object Implicits {

  trait Dep[T, R] {
    def dep: R
  }

  implicit val fooDep = new Dep[Foo, FooBuilder] {
    val dep = new FooBuilder
  }

  implicit val barDep = new Dep[Bar, BarBuilder] {
    val dep = new BarBuilder
  }

}
