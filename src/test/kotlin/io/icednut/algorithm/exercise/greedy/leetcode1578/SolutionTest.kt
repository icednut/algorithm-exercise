package io.icednut.algorithm.exercise.greedy.leetcode1578

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    @Test
    fun test01() {
        val solution = Solution()

        // [259,770],[448,54],[926,667],[184,139],[840,118],[577,469]
        val result = solution.twoCitySchedCost(
            arrayOf(
                intArrayOf(259, 770),
                intArrayOf(448, 54),
                intArrayOf(926, 667),
                intArrayOf(184, 139),
                intArrayOf(840, 118),
                intArrayOf(577, 469),
            )
        )

        assertEquals(1859, result)
    }
}