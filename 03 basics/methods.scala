object methods extends App {
  def printHello(name: String = "sir") {
    println(s"Hello, $name.")
  }
  printHello("bob")
}
