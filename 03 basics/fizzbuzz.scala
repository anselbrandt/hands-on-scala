object fizzbuzz extends App {
  (1 to 100)
    .map(i =>
      if (i % 3 == 0 && i % 5 == 0) "FizzBuzz"
      else if (i % 3 == 0) "Fizz"
      else if (i % 5 == 0) "Buzz"
      else i
    )
    .foreach(el => println(el))
}
