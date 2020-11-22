package binarytree

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
class Solution {
    // DFS暴力解
    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
        return dfs(s, t)
    }

    private fun dfs(s: TreeNode?, t: TreeNode?): Boolean {
        if (s == null) return false

        return check(s, t) || dfs(s.left, t) || dfs(s.right, t)
    }

    private fun check(s: TreeNode?, t: TreeNode?): Boolean {
        if (s == null && t == null) {
            return true
        }

        if (s == null || t == null || s.`val` != t.`val`) {
            return false
        }

        return check(s.left, t.left) && check(s.right, t.right)
    }

}
