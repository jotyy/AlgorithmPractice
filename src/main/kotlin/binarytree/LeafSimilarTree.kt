package binarytree

/**
 * 872. 叶子相似的树
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 *
 * 思路：
 * 首先，找出给定两个树的叶值序列
 * 之后比较它们是否相等
 */
class LeafSimilarTree {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaves1 = arrayListOf<Int>()
        val leaves2 = arrayListOf<Int>()

        dfs(root1, leaves1)
        dfs(root2, leaves2)

        return leaves1 == leaves2
    }

    private fun dfs(node: TreeNode?, leaves: ArrayList<Int>) {
        node?.let {
            if (node.left == null && node.right == null) {
                leaves.add(node.`val`)
            }
            dfs(node.left, leaves)
            dfs(node.right, leaves)
        }
    }
}
