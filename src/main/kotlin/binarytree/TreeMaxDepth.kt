package binarytree

/**
 * 104. 二叉树最大深度
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
class TreeMaxDepth {
    fun maxDepth(root: TreeNode?): Int {
        root?.let {
            if (root.left == null && root.right == null) {
                return 1
            }

            var depth = Int.MIN_VALUE
            root.left?.let {
                depth = Math.max(maxDepth(it), depth)
            }
            root.right?.let {
                depth = Math.max(maxDepth(it), depth)
            }
            return depth + 1
        } ?: return 0
    }
}
