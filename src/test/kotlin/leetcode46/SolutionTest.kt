package leetcode46

import backtracking.leetcode46.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val solution = Solution()
        val result = solution.permute(nums)

        assertEquals(6, result.size)
        println(result)
    }
}