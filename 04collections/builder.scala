object builder extends App {
  val b = Array.newBuilder[Int]
  b += 1
  b += 2
  b.result()
  b.result().foreach(println(_))
}
