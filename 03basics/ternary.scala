object ternary extends App {
  (1 to 10)
    .map(i => if (i % 2 == 0) (i, "even") else (i, "odd"))
    .foreach(i => println(i))
}
