package sample.int

import language.experimental.macros
import scala.reflect.macros.whitebox.Context

class Foo
class Bar extends Foo { def launchMissiles = "launching" }

object FooExample {
  def foo: Int = macro foo_impl
  def foo_impl(c: Context): c.Expr[Int] =
    c.Expr[Int](c.universe.reify(new Bar).tree)
}
