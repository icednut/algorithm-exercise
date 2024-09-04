package io.icednut.algorithm.exercise.graph.leet785.replay

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test01() {
        val solution = Solution()

        val result = solution.isBipartite(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(0, 2),
                intArrayOf(0, 1, 3),
                intArrayOf(0, 2),
            )
        )

        assertEquals(false, result)
    }

    @Test
    fun test02() {
        val solution = Solution()

        val result = solution.isBipartite(
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(0, 2),
                intArrayOf(1, 3),
                intArrayOf(0, 2),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test03() {
        val solution = Solution()

        val result = solution.isBipartite(
            arrayOf(
                intArrayOf(1),
                intArrayOf(0, 3),
                intArrayOf(3),
                intArrayOf(1, 2),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test04() {
        val solution = Solution()

        val result = solution.isBipartite(
            arrayOf(
                intArrayOf(),
                intArrayOf(2, 4, 6),
                intArrayOf(1, 4, 8, 9),
                intArrayOf(7, 8),
                intArrayOf(1, 2, 8, 9),
                intArrayOf(6, 9),
                intArrayOf(1, 5, 7, 8, 9),
                intArrayOf(3, 6, 9),
                intArrayOf(2, 3, 4, 6, 9),
                intArrayOf(2, 4, 5, 6, 7, 8),
            )
        )

        assertEquals(false, result)
    }
}