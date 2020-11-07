package binarytree

/**
 * 110.高度平衡二叉树
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
class BalanceBinaryTree {
    fun isBalanced(root: TreeNode?): Boolean {
        root?.let {
            return Math.abs(check(root.left) - check(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right)
        } ?: return true
    }

    private fun check(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        return Math.max(check(root.left), check(root.right)) + 1
    }
}
