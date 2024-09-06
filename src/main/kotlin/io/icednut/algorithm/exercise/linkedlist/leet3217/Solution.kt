package io.icednut.algorithm.exercise.linkedlist.leet3217

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        val numContainer = HashMap<Int, Boolean>()
        nums.associateByTo(numContainer, { it }, { true })

        fun go(node: ListNode?, current: ListNode?, prev: ListNode?): ListNode? {
            if (node == null) {
                return null
            }

            if (current == null) {
                return node
            }

            var nextPrev = current
            val currentNextNode = current.next
            if (currentNextNode?.`val` != null && numContainer[currentNextNode.`val`] != null && numContainer[current.`val`] == null) {
                current.next = current.next?.next
            } else if (numContainer[current.`val`] != null) {
                prev?.next = current.next

                if (prev != null) {
                    nextPrev = prev
                }
            }
            return go(node, current.next, nextPrev)
        }

        val result = go(head, head, null)

        if (result != null && numContainer[result.`val`] != null) {
            return result.next
        }
        return result
    }
}
