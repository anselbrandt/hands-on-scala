object comprehension extends App {
  def isPrime(n: Int): Boolean = {
    def test(i: Int, n2: Int): Boolean = {
      if (i * i > n2) true
      else if (n2 % i == 0 || n2 % (i + 2) == 0) false
      else test(i + 6, n2)
    }
    if (n <= 1) false
    else if (n <= 3) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else test(5, n)
  }

  // yield only if guard true
  val a = (1 to 100)
  val b = for (i <- a if isPrime(i)) yield i

  val greetings = Array("hello", "goodbye")
  val names = Array("bob", "anna")
  val lastNames = Array("loblaw", "kendrick")
  val d =
    for (greeting <- greetings; name <- names; lastName <- lastNames)
      yield s"$greeting, $name $lastName"
  d.foreach(el => println(el))
}
