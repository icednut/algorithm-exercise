package sort.leetcode215

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution2Test {

    @Test
    fun test01() {
        val solution = Solution2()
        val arr = intArrayOf(3, 2, 1, 5, 6, 4)
        val k = 2
        val result = solution.findKthLargest(arr, k)

        assertEquals(5, result )
    }

    @Test
    fun test02() {
        val solution = Solution2()
        val arr = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6)
        val k = 4
        val result = solution.findKthLargest(arr, k)

        assertEquals(4, result)
    }

    @Test
    fun test03() {
        val solution = Solution2()
        val arr = intArrayOf(9, 2, 1, 7, 3, 4, 5, 5, 2)
        val k = 4
        val result = solution.findKthLargest(arr, k)

        assertEquals(5, result)
    }
}