package leetcode78

import backtracking.leetcode78.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val solution = Solution()
        val result = solution.subsets(nums)

        assertEquals(8, result.size)
        println(result)
    }
}