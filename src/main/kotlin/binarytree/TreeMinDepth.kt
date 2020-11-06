package binarytree

/**
 * 101.二叉树最小深度
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
class TreeMinDepth {
    /**
     * 深度优先搜索
     */
    private fun minDepth(root: TreeNode?): Int {
        root?.let {
            if (it.left == null && it.right == null) {
                return 1
            }

            var depth = Int.MAX_VALUE
            if (it.left != null) {
                depth = Math.min(minDepth(it.left), depth)
            }
            if (it.right != null) {
                depth = Math.min(minDepth(it.right), depth)
            }

            return depth + 1
        } ?: return 0
    }
}
