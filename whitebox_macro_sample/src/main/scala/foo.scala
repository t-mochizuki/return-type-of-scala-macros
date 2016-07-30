package sample.foo

import language.experimental.macros
import scala.reflect.macros.whitebox.Context

class Foo
class Bar extends Foo { def launchMissiles = "launching" }

object FooExample {
  def foo: Foo = macro foo_impl
  def foo_impl(c: Context): c.Expr[Foo] =
    c.Expr[Foo](c.universe.reify(new Bar).tree)
}
