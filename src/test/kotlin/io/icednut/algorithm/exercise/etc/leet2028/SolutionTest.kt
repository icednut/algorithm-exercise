package io.icednut.algorithm.exercise.etc.leet2028

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test01() {
        val solution = Solution()

        val output = solution.missingRolls(
            rolls = intArrayOf(3, 2, 4, 3),
            mean = 4,
            n = 2
        )

        val expected = intArrayOf(6, 6)
        assertEquals(expected.sum(), output.sum())
    }

    @Test
    fun test02() {
        val solution = Solution()

        val output = solution.missingRolls(
            rolls = intArrayOf(3, 5, 3),
            mean = 5,
            n = 3
        )

        val expected = intArrayOf()
        assertEquals(expected.sum(), output.sum())
    }

    @Test
    fun test03() {
        val solution = Solution()

        val output = solution.missingRolls(
            rolls = intArrayOf(1),
            mean = 3,
            n = 1
        )

        val expected = intArrayOf(5)
        assertEquals(expected.sum(), output.sum())
    }

    @Test
    fun test04() {
        val solution = Solution()

        val output = solution.missingRolls(
            rolls = intArrayOf(
                4,
                5,
                6,
                2,
                3,
                6,
                5,
                4,
                6,
                4,
                5,
                1,
                6,
                3,
                1,
                4,
                5,
                5,
                3,
                2,
                3,
                5,
                3,
                2,
                1,
                5,
                4,
                3,
                5,
                1,
                5
            ),
            mean = 4,
            n = 40
        )

        val expected = intArrayOf(
            4,
            4,
            4,
            4,
            4,
            4,
            5,
            5,
            4,
            4,
            4,
            5,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            5,
            5,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            4,
            5,
            5
        )

        assertEquals(expected.sum(), output.sum())
    }
}