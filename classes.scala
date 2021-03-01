object classes extends App {
  class Foo(x: Int) {
    def printMsg(msg: String) = {
      println(msg + x)
    }
  }
  val f = new Foo(1)
  f.printMsg("hello")
  class Bar(var x: Int) {
    def printMsg(msg: String) = {
      println(msg + x)
    }
  }
  val b = new Bar(1)
  b.x = 2
  println(b.x)
  class Counter(x: Int) {
    private var i = x
    def printCount() = {
      i += 1
      println(s"Count $i")
    }
  }
  val c = new Counter(0)
  c.printCount()
  c.printCount()
  c.printCount()
  class Baz(x: Int) {
    private val bangs = "!" * x
    def printMsg(msg: String) = {
      println(msg + bangs)
    }
  }
  val d = new Baz(3)
  d.printMsg("Hello")
}
