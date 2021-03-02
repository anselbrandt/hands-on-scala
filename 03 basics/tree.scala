object test extends App {
  class Node(val id: Int, val parent: Option[Int])
  val nodes = Array(
    new Node(0, None),
    new Node(1, Some(0)),
    new Node(2, None),
    new Node(3, Some(2)),
    new Node(4, Some(2)),
    new Node(5, Some(2)),
    new Node(6, Some(5))
  )
  def printNodes(nodes: Array[Node]) = {}
  printNodes(nodes)
}
