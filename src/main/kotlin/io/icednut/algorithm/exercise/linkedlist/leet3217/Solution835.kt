package io.icednut.algorithm.exercise.linkedlist.leet3217

class Solution835 {

    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        val isInNums = BooleanArray(100001)
        for (x in nums) isInNums[x] = true

        val preHead = ListNode(0)
        preHead.next = head

        var current = preHead
        while (current.next != null) {
            val next = current.next
            if (next != null && !isInNums[next.`val`]) {
                current = next
                continue
            }
            current.next = next?.next
        }


        return preHead.next
    }
}
