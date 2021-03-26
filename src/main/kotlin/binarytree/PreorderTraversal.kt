package binarytree

import java.util.*
import kotlin.collections.ArrayList

/**
 * 二叉树前序遍历
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
class PreorderTraversal {
    // 递归
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = arrayListOf<Int>()
        preorder(root, result)
        return result
    }

    private fun preorder(root: TreeNode?, result: ArrayList<Int>) {
        if (root == null) {
            return
        }
        result.add(root.`val`)
        preorder(root.left, result)
        preorder(root.right, result)
    }

    // 迭代
    fun preorderTraversalInterate(root: TreeNode?): List<Int> {
        val result = arrayListOf<Int>()
        if (root == null) {
            return result
        }

        val stack = LinkedList<TreeNode>()
        var node = root
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                result.add(node.`val`)
                stack.push(node)
                node = node.left
            }
            node = stack.pop()
            node = node.right
        }
        return result
    }
}
