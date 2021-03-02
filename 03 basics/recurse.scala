object recurse extends App {
  def series(n: Int): Int = {
    println(s"${n} +")
    if (n == 1) 1 else n + series(n - 1)
  }
  def factorial(n: Int): Int = {
    println(s"${n} x")
    if (n == 1) 1 else n * factorial(n - 1)
  }
  println(series(4))
  println(factorial(4))
}
