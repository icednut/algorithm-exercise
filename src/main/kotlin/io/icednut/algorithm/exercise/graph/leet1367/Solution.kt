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

        val actualHistorySize = dfs(root, history, 0)

        return history.size == actualHistorySize
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

    private fun dfs(root: TreeNode?, history: LinkedList<Int>, i: Int): Int {
        if (root == null) {
            return i
        }
        if (i >= history.size) {
            return i
        }

        val currentVal = root.`val`
        val nextIndex = if (history[i] == currentVal) {
            i + 1
        } else {
            i
        }

        val leftResult = dfs(root.left, history, nextIndex)
        val rightResult = dfs(root.right, history, nextIndex)

        if (leftResult > rightResult) {
            return leftResult
        }
        return rightResult
    }
}