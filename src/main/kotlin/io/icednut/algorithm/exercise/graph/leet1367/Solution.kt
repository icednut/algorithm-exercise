package io.icednut.algorithm.exercise.graph.leet1367

import java.util.*

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
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
    fun isSubPath(head: ListNode?, root: TreeNode?): Boolean {
        val history = convert(head)

        return dfs(
            root,
            history,
            LinkedList<Int>()
        )
    }

    private fun convert(head: ListNode?): LinkedList<Int> {
        val result = LinkedList<Int>()

        if (head == null) {
            return result
        }

        var node = head

        while (node != null) {
            result.add(node.`val`)

            node = node.next
        }
        return result
    }

    private fun dfs(node: TreeNode?, targets: LinkedList<Int>, visited: LinkedList<Int>): Boolean {
        if (node == null) {
            return visited.windowed(targets.size).any { it == targets}
        }

        if (visited.windowed(targets.size).any { it == targets}) {
            return true
        }

        visited.add(node.`val`)

        val leftResult = dfs(node.left, targets, visited.clone() as LinkedList<Int>)
        val rightResult = dfs(node.right, targets, visited.clone() as LinkedList<Int>)

        return if (leftResult || rightResult) {
            true
        } else {
            false
        }
    }
}