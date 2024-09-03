package io.icednut.algorithm.exercise.graph.leet207

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution2Test {

    @Test
    fun test01() {
        val solution = Solution2()

        val result = solution.canFinish(
            numCourses = 2,
            prerequisites = arrayOf(
                intArrayOf(1, 0)
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test02() {
        val solution = Solution2()

        val result = solution.canFinish(
            numCourses = 2,
            prerequisites = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(0, 1)
            )
        )

        assertEquals(false, result)
    }

    @Test
    fun test03() {
        val solution = Solution2()

        val result = solution.canFinish(
            numCourses = 5,
            prerequisites = arrayOf(
                intArrayOf(1, 4),
                intArrayOf(2, 4),
                intArrayOf(3, 1),
                intArrayOf(3, 2),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test04() {
        val solution = Solution2()

        val result = solution.canFinish(
            numCourses = 3,
            prerequisites = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(2, 0),
                intArrayOf(0, 2),
            )
        )

        assertEquals(false, result)
    }
}