object flexbuzz extends App {
  def flexbuzz(f: String => Unit): Unit = {
    (1 to 100)
      .map(i => {
        if (i % 15 == 0) "FizzBuzz"
        else if (i % 3 == 0) "Fizz"
        else if (i % 5 == 0) "Buzz"
        else i.toString
      })
      .foreach(x => f(x))
  }
  def printer(s: String): Unit = {
    println(s)
  }
  var i = 0
  val output = new Array[String](100)
  def append(s: String): Unit = {
    output(i) = s
    i += 1
  }
  class Store(size: Int) {
    private var i = 0
    private val output = new Array[String](size)
    def save(s: String) = {
      output(i) = s
      i += 1
    }
    def print = {
      output.foreach(println(_))
    }
  }
  val b = new Store(100)
  flexbuzz(b.save(_))
  b.print
}
