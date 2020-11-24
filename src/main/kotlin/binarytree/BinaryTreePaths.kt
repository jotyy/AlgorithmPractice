package binarytree

/**
 * 257.二叉树的所有路径
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
class BinaryTreePaths {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val paths = arrayListOf<String>()
        dfs(root, "", paths)
        return paths
    }

    private fun dfs(root: TreeNode?, path: String, paths: ArrayList<String>) {
        if (root != null) {
            val sb = StringBuffer(path)
            sb.append(root.`val`.toString())
            if (root.left == null && root.right == null) {
                paths.add(sb.toString())
            } else {
                sb.append("->")
                dfs(root.left, sb.toString(), paths)
                dfs(root.right, sb.toString(), paths)
            }
        }
    }
}
