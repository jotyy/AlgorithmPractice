package binarytree

/**
 * Definition for a Node.
 *
 * 116.填充每个节点的下一个右侧节点指针
 */
class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}

class Connect {
    private fun connect(root: Node?): Node? {
        root?.let {
            connectTwoNode(root.left, root.right)
            return root
        } ?: return null
    }

    private fun connectTwoNode(node1: Node?, node2: Node?) {
        if (node1 == null || node2 == null) {
            return
        }

        // 前序遍历位置
        // 连接传入的两个点
        node1.next = node2

        // 连接相同父节点的两个节点
        connectTwoNode(node1.left, node1.right)
        connectTwoNode(node2.left, node2.right)
        // 连接跨越父节点的两个节点
        connectTwoNode(node1.right, node2.left)
    }
}
