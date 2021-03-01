object loop extends App {
  for (i <- Range(0, 5)) {
    println("Index " + i)
  }
  val list = List("cat", "tree", "dog")
  for (el <- list) println(el)
  val multi = Array(Array(1, 2, 3), Array(4, 5, 6))
  for (arr <- multi; i <- arr) println(i)
  // loop with guards
  for (arr <- multi; i <- arr; if i % 2 == 0) println(i)
}
