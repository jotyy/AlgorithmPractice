package binarytree

/**
 * 100.相同的树
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
class SameTree {
    private fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return if (p == null && q == null) {
            true
        } else if (p == null || q == null) {
            false
        } else if (p.`val` != q.`val`) {
            false
        } else {
            isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
    }
}
