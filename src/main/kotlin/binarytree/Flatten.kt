package binarytree

/**
 * 114.二叉树展开成链表
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Flatten {
    private fun flatten(root: TreeNode?): Unit {
        root?.let{

            flatten(root.left)
            flatten(root.right)

            /// 后序遍历位置
            // 1.左右子树已被展开
            val left = root.left
            val right = root.right

            // 2.将左子树作为右子树
            root.left = null
            root.right = left

            // 3. 将原右子树接到当前右子树末端
            var p = root
            while(p?.right != null) {
                p = p.right
            }
            p?.right = right
        }
    }
}
