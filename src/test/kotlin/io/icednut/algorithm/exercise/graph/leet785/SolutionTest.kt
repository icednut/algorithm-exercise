package io.icednut.algorithm.exercise.graph.leet785

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * TODO
 * - BFS로 순회
 * - Queue에 좌표와 color를 함께 넣는다.
 * - color에 해당하는 hashSet에 인덱스를 넣는다.
 * - red color와 green color의 길이가 같으면 bipatite graph, 아니면 common graph
 */
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
                intArrayOf(3),
                intArrayOf(2, 4),
                intArrayOf(1),
                intArrayOf(0, 4),
                intArrayOf(1, 3),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test04() {
        val solution = Solution()

        val result = solution.isBipartite(
            arrayOf(
                intArrayOf(4),
                intArrayOf(),
                intArrayOf(4),
                intArrayOf(4),
                intArrayOf(0, 2, 3),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test05() {
        val solution = Solution()

        val result = solution.isBipartite(
            arrayOf(
                intArrayOf(),
                intArrayOf(3),
                intArrayOf(),
                intArrayOf(1),
                intArrayOf(),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test06() {
        val solution = Solution()

        val result = solution.isBipartite(
            arrayOf(
                intArrayOf()
            )
        )

        assertEquals(true, result)
    }
}