object test extends App {

  class Node(val id: Int, val parent: Option[Int], val msg: String)

  val nodes = Array(
    new Node(0, None, "Hello"),
    new Node(1, Some(0), "World"),
    new Node(2, None, "I am Cow"),
    new Node(3, Some(2), "Hear me moo"),
    new Node(4, Some(2), "Here I stand"),
    new Node(5, Some(2), "I am Cow"),
    new Node(6, Some(5), "Here me moo, moo")
  )

  def printNodes(nodes: Array[Node]) = {

    def printNode(parent: Option[Int], depth: Int): Unit = {
      for (node <- nodes if node.parent == parent) {
        println(s"${node.id} parent ${parent} depth $depth")
        printNode(Some(node.id), depth + 1)
      }
    }

    printNode(None, 0)
  }

  printNodes(nodes)
}
