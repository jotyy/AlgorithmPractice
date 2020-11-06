package binarytree

/**
 * 101.对称的树
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
class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {
        return check(root, root)
    }

    private fun check(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }
        if (p == null || q == null) {
            return false
        }
        return p.`val` == q.`val` && check(p.left, q.right) && check(p.right, q.left)
    }
}
