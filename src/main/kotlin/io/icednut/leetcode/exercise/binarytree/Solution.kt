package io.icednut.leetcode.exercise.binarytree

data class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        fun run(node: TreeNode?, result: MutableList<Int>) {
            node?.left.let {
                run(it, result)
            }
            node?.`val`.let {
                result.add(node?.`val`)
            }
            if (node?.right != null) {
                run(node?.right, result)
            }
        }

        var result = mutableListOf<Int>()

        run(root, result)
        return result.toList()
    }
}