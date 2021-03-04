object operations extends App {
  def stdDev(a: Array[Double]): Double = {
    val mean = a.sum / a.length
    println(s"mean ${mean}")
    val squareErrors = a.map(x => x - mean).map(x => x * x)
    math.sqrt(squareErrors.sum / a.length)
  }
  val data = Array[Double](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(stdDev(data))
}
