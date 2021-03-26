package binarytree

import java.util.ArrayList

/**
 * 二叉树后序遍历
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
class PostorderTraversal {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = arrayListOf<Int>()
        postorder(root, result)
        return result
    }

    private fun postorder(root: TreeNode?, result: ArrayList<Int>) {
        if (root == null) {
            return
        }
        postorder(root.right, result)
        result.add(root.`val`)
        postorder(root.left, result)
    }
}
