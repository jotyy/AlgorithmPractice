package binarytree

/**
 * 222.完全二叉树节点个数
 *
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class CompleteTreeNodes {
    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        return countNodes(root.left) + countNodes(root.right) + 1
    }
}
