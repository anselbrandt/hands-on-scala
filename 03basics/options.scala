object options extends App {
  def hello(title: String, firstName: String, lastName: Option[String]) = {
    lastName match {
      case Some(lastName) => println(s"Hello, $title. $lastName")
      case None           => println(s"Hello, $firstName")
    }
  }
  def goodbye(title: String, firstName: String, lastName: Option[String]) = {
    val name = lastName.getOrElse("NoName")
    println(s"Goodbye, $title. $firstName $name")
  }
  def nameLenght(name: Option[String]) = {
    name.map(_.length).getOrElse(-1)
  }
  hello("Mr", "Bob", Some("Loblaw"))
  hello("Mr", "Bob", None)
  goodbye("Mr", "Bob", None)
  println(nameLenght(Some("McLovin")))
  println(nameLenght(None))
}
