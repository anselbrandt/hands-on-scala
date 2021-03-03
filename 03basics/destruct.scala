object destruct extends App {
  val tuple = (1, true, "hello")
  val list = List(tuple._1, tuple._2, tuple._3)
  val (a, b, c) = tuple
  println(a, b, c)
  list.foreach(el => println(el))
}
