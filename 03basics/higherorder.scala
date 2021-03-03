object higherorder extends App {
  class Box(var x: Int) {
    def update(f: Int => Int) = x = f(x)
    def printMsg(msg: String) = {
      println(msg + x)
    }
  }
  val b = new Box(1)
  b.printMsg("Hello")
  b.update(i => i + 5)
  def increment(i: Int) = i + 1
  b.update(increment)
  // Explicitly writing out lamda
  b.update(x => increment(x))
  // Methods taking single lambda can be called with {}
  b.update { x => increment(x) }
  // Placeholder syntax
  b.update(increment(_))
  b.printMsg("Hello")
}
