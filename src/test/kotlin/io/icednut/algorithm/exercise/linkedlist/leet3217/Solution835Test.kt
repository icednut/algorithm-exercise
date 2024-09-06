package io.icednut.algorithm.exercise.linkedlist.leet3217

import org.junit.jupiter.api.Test

class Solution835Test {

    @Test
    fun test01() {
        val solution = Solution835()

        val root = ListNode(1)
        val b = ListNode(2)
        val c = ListNode(3)
        val d = ListNode(4)
        val e = ListNode(5)
        root.next = b
        b.next = c
        c.next = d
        d.next = e

        val output = solution.modifiedList(
            nums = intArrayOf(1, 2, 3),
            head = root
        )

        kotlin.test.assertEquals(d, output)
    }

    @Test
    fun test02() {
        val solution = Solution835()

        val root = ListNode(1)
        val b = ListNode(2)
        val c = ListNode(1)
        val d = ListNode(2)
        val e = ListNode(1)
        val f = ListNode(2)
        root.next = b
        b.next = c
        c.next = d
        d.next = e
        e.next = f

        val output = solution.modifiedList(
            nums = intArrayOf(1),
            head = root
        )

        kotlin.test.assertEquals(b, output)
        kotlin.test.assertEquals(d, output?.next)
        kotlin.test.assertEquals(f, output?.next?.next)
    }

    @Test
    fun test03() {
        val solution = Solution835()

        val root = ListNode(4)
        val b = ListNode(8)
        val c = ListNode(9)
        val d = ListNode(5)
        val e = ListNode(2)
        root.next = b
        b.next = c
        c.next = d
        d.next = e

        val output = solution.modifiedList(
            nums = intArrayOf(3, 5, 9, 8, 7),
            head = root
        )

        kotlin.test.assertEquals(root, output)
        kotlin.test.assertEquals(e, output?.next)
    }

    @Test
    fun test04() {
        val solution = Solution835()

        val root = ListNode(1)
        val b = ListNode(2)
        val c = ListNode(3)
        val d = ListNode(4)
        val e = ListNode(5)
        root.next = b
        b.next = c
        c.next = d
        d.next = e

        val output = solution.modifiedList(
            nums = intArrayOf(2, 3, 4, 5),
            head = root
        )

        kotlin.test.assertEquals(root, output)
        kotlin.test.assertEquals(null, output?.next)
    }
}