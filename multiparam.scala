object multiparam extends App {
  def myLoop(start: Int, end: Int)(cb: Int => Unit) = {
    // (start until end) or Range(start, end) exclusive
    for (i <- (start to end)) { cb(i) }
  }
  myLoop(start = 5, end = 10) { i => println(s"i has value ${i}") }
}
