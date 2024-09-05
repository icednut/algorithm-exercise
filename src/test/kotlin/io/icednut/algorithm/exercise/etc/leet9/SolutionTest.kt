package io.icednut.algorithm.exercise.etc.leet9

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test01() {
        val solution = Solution()

        val output = solution.isPalindrome(121)

        assertEquals(true, output)
    }

    @Test
    fun test02() {
        val solution = Solution()

        val output = solution.isPalindrome(-121)

        assertEquals(false, output)
    }
}