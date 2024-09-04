package io.icednut.algorithm.exercise.etc.leet874

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution3Test {

    @Test
    fun test01() {
        val solution = Solution()

        val result = solution.robotSim(
            commands = intArrayOf(4, -1, 3),
            obstacles = arrayOf<IntArray>()
        )

        assertEquals(25, result)
    }

    @Test
    fun test02() {
        val solution = Solution()

        val result = solution.robotSim(
            commands = intArrayOf(4, -1, 4, -2, 4),
            obstacles = arrayOf(
                intArrayOf(2, 4)
            )
        )

        assertEquals(65, result)
    }

    @Test
    fun test03() {
        val solution = Solution()

        val result = solution.robotSim(
            commands = intArrayOf(6, -1, -1, 6),
            obstacles = arrayOf()
        )

        assertEquals(36, result)
    }
}