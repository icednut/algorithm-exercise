package io.icednut.algorithm.exercise.backtracking.leetcode46

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