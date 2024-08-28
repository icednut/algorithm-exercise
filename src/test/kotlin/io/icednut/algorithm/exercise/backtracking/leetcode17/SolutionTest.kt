package io.icednut.algorithm.exercise.backtracking.leetcode17

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test1() {
        val solution = Solution()
        val result = solution.letterCombinations("23")

        assertEquals(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result)
    }

    @Test
    fun test2() {
        val solution = Solution()
        val result = solution.letterCombinations("")

        assertEquals(listOf<String>(), result)
    }

    @Test
    fun test3() {
        val solution = Solution()
        val result = solution.letterCombinations("2")

        assertEquals(listOf("a", "b", "c"), result)
    }
}