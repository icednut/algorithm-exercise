package io.icednut.algorithm.exercise.graph.leet1091

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test01() {
        val solution = Solution()

        val result = solution.shortestPathBinaryMatrix(
            arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 0),
            )
        )

        assertEquals(2, result)
    }

    @Test
    fun test02() {
        val solution = Solution()

        val result = solution.shortestPathBinaryMatrix(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 0),
            )
        )

        assertEquals(4, result)
    }

    @Test
    fun test03() {
        val solution = Solution()

        val result = solution.shortestPathBinaryMatrix(
            arrayOf(
                intArrayOf(1, 0, 0),
                intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 0),
            )
        )

        assertEquals(-1, result)
    }
}