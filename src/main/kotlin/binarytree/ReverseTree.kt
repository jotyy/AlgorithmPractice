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
class TreeNode (var `val`: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class ReverseTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        root?.let {
            val tmp = root.right
            root.right = root.left
            root.left = tmp

            invertTree(root.left)
            invertTree(root.right)

            return root
        } ?: return null
    }
}
