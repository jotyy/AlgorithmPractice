package binarytree

/**
 * 102.二叉树层序遍历
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
class LevelOrder {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        root?.let {
            val list = arrayListOf<ArrayList<Int>>()
            dfs(1, root, list)
            return list
        } ?: return emptyList()
    }

    private fun dfs(index: Int, node: TreeNode?, list: ArrayList<ArrayList<Int>>) {
        if (list.size < index) {
            list.add(ArrayList<Int>())
        }

        list[index - 1].add(node?.`val` ?: 0)
        node?.left?.let { dfs(index + 1, node.left, list) }
        node?.right?.let { dfs(index + 1, node.right, list) }
    }
}
