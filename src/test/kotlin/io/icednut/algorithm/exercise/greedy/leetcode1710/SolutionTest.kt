package io.icednut.algorithm.exercise.greedy.leetcode1710

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test1() {
        val solution = Solution()

        val maximumUnits = solution.maximumUnits(arrayOf(intArrayOf(1, 3), intArrayOf(2, 2), intArrayOf(3, 1)), 4)

        assertEquals(8, maximumUnits)
    }

    @Test
    fun test2() {
        val solution = Solution()

        val maximumUnits = solution.maximumUnits(arrayOf(intArrayOf(5, 10), intArrayOf(2, 5), intArrayOf(4, 7), intArrayOf(3, 9)), 10)

        assertEquals(91, maximumUnits)
    }
}