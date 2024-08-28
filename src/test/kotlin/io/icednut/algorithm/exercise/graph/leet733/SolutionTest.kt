package io.icednut.algorithm.exercise.graph.leet733

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test01() {
        val solution = Solution()

        val floodFill = solution.floodFill(
            image = arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
            ),
            sr = 1,
            sc = 1,
            color = 2
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(2, 2, 2),
                intArrayOf(2, 2, 0),
                intArrayOf(2, 0, 1),
            ),
            floodFill
        )
    }

    @Test
    fun test02() {
        val solution = Solution()

        val floodFill = solution.floodFill(
            image = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0)
            ),
            sr = 0,
            sc = 0,
            color = 0
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0)
            ),
            floodFill
        )
    }

    @Test
    fun test03() {
        val solution = Solution()

        val floodFill = solution.floodFill(
            image = arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0)
            ),
            sr = 1,
            sc = 0,
            color = 2
        )

        assertArrayEquals(
            arrayOf(
                intArrayOf(2, 2, 2),
                intArrayOf(2, 2, 2)
            ),
            floodFill
        )
    }
}