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
  def getNodes(nodes: Array[Node]) = {
    def getDepth(parent: Option[Int], depth: Int): Unit = {
      for (node <- nodes if node.parent == parent) {
        println(
          s"Node ${node.id} Parent ${node.parent.getOrElse("root")} Depth $depth"
        )
        getDepth(Some(node.id), depth + 1)
      }
    }
    getDepth(None, 0)
  }
  getNodes(nodes)
}
