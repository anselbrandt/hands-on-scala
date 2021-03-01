object traits extends App {
  trait Point { def hypotonuse: Double }
  class Point2d(x: Double, y: Double) extends Point {
    def hypotonuse: Double = math.sqrt(x * x + y * y)
  }
  class Point3d(x: Double, y: Double, z: Double) extends Point {
    def hypotonuse: Double = math.sqrt(x * x + y * y + z * z)
  }
  val points: Array[Point] = Array(new Point2d(1, 2), new Point3d(4, 5, 6))
  for (p <- points) println(s"Hypotenuse ${p.hypotonuse}")
}
