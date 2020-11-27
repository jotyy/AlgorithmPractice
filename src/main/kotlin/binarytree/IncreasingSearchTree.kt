package binarytree

import java.util.ArrayList


/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class IncreasingSearchTree {
    fun increasingBST(root: TreeNode?): TreeNode? {
        val list = arrayListOf<Int>()
        inorder(root, list)
        val ans = TreeNode(0)
        var current = ans
        list.forEach {
            current.right = TreeNode(it)
            current = current.right!!
        }
        return ans.right
    }

    private fun inorder(node: TreeNode?, list: ArrayList<Int>) {
        if (node == null) return
        inorder(node.left, list)
        list.add(node.`val`)
        inorder(node.right, list)
    }
}
