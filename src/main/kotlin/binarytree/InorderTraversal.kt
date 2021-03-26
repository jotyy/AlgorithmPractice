package binarytree

/**
 * 94.二叉树中序遍历
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
class InorderTraversal {

    // 递归
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = arrayListOf<Int>()
        inorder(root, result)
        return result
    }

    private fun inorder(root: TreeNode?, result: ArrayList<Int>) {
        if (root == null) {
            return
        }
        inorder(root.left, result)
        result.add(root.`val`)
        inorder(root.right, result)
    }
}
