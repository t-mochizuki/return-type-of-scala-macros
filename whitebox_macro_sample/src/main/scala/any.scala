package sample.any

import language.experimental.macros
import scala.reflect.macros.whitebox.Context

class Foo
class Bar extends Foo { def launchMissiles = "launching" }

object FooExample {
  def foo: Any = macro foo_impl
  def foo_impl(c: Context): c.Expr[Any] =
    c.Expr[Any](c.universe.reify(new Bar).tree)
}
