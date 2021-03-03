object test extends App {

  class Node(val id: Int, val parent: Option[Int])

  val nodes = Array(
    new Node(4, Some(3)),
    new Node(5, Some(4)),
    new Node(10, Some(9)),
    new Node(1, None),
    new Node(2, Some(1)),
    new Node(3, Some(2)),
    new Node(6, Some(5)),
    new Node(7, Some(6)),
    new Node(8, Some(7)),
    new Node(9, Some(8))
  )

  def printNodes(nodes: Array[Node]) = {

    def printNode(parent: Option[Int], depth: Int): Unit = {
      for (node <- nodes if node.parent == parent) {
        val indent = "  " * depth
        println(s"${indent}${node.id} parent ${parent} depth $depth ")
        printNode(Some(node.id), depth + 1)
      }
    }

    printNode(None, 0)
  }

  printNodes(nodes)
}

/*

https://www.youtube.com/watch?v=aPQY__2H3tE
https://www.geeksforgeeks.org/dynamic-programming-trees-set-2/

 */
