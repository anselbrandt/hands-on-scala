object types extends App {
  val range = (1 to 5)
  val range2 = (1 until 5)
  val x = range.getClass()
  val y = range2.getClass()
  println(x, range)
  println(y, range2)
}
