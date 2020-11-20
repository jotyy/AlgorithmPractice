package binarytree

/**
 * 617.合并二叉树
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
class MergeTrees {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null || t2 == null) {
            return t1 ?: t2
        }

        return merge(t1, t2)
    }

    private fun merge(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null || t2 == null) {
            return t1 ?: t2
        }

        t1.`val` += t2.`val`
        t1.left = merge(t1.left, t2.left)
        t1.right = merge(t1.right, t2.right)
        return t1
    }
}
