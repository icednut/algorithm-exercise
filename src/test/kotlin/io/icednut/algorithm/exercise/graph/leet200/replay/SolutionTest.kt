package io.icednut.algorithm.exercise.graph.leet200.replay

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test01() {
        val solution = Solution()

        val output = solution.numIslands(
            arrayOf(
                charArrayOf('1', '1', '1', '1', '0'),
                charArrayOf('1', '1', '0', '1', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '0', '0', '0'),
            )
        )

        assertEquals(1, output)
    }

    @Test
    fun test02() {
        val solution = Solution()

        val output = solution.numIslands(
            arrayOf(
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '1', '0', '0'),
                charArrayOf('0', '0', '0', '1', '1'),
            )
        )

        assertEquals(3, output)
    }

    @Test
    fun test03() {
        val solution = Solution()

        val output = solution.numIslands(
            arrayOf(
                charArrayOf('1', '1', '1'),
                charArrayOf('0', '1', '0'),
                charArrayOf('0', '1', '0'),
            )
        )

        assertEquals(1, output)
    }


    @Test
    fun test04() {
        val solution = Solution()

        val numIslands = solution.numIslands(
            arrayOf(
                charArrayOf('1', '1', '1'),
                charArrayOf('0', '1', '0'),
                charArrayOf('1', '1', '1'),
            )
        )

        assertEquals(1, numIslands)
    }

    @Test
    fun test05() {
        val solution = Solution()

        val numIslands = solution.numIslands(
            arrayOf(
                charArrayOf('1', '0', '1', '1', '1'),
                charArrayOf('1', '0', '1', '0', '1'),
                charArrayOf('1', '1', '1', '0', '1'),
            )
        )

        assertEquals(1, numIslands)
    }

    @Test
    fun test06() {
        val solution = Solution()

        val numIslands = solution.numIslands(
            arrayOf(
                charArrayOf('1','0','0','1','1','1','0','1','1','0','0','0','0','0','0','0','0','0','0','0'),
                charArrayOf('1','0','0','1','1','0','0','1','0','0','0','1','0','1','0','1','0','0','1','0'),
                charArrayOf('0','0','0','1','1','1','1','0','1','0','1','1','0','0','0','0','1','0','1','0'),
                charArrayOf('0','0','0','1','1','0','0','1','0','0','0','1','1','1','0','0','1','0','0','1'),
                charArrayOf('0','0','0','0','0','0','0','1','1','1','0','0','0','0','0','0','0','0','0','0'),
                charArrayOf('1','0','0','0','0','1','0','1','0','1','1','0','0','0','0','0','0','1','0','1'),
                charArrayOf('0','0','0','1','0','0','0','1','0','1','0','1','0','1','0','1','0','1','0','1'),
                charArrayOf('0','0','0','1','0','1','0','0','1','1','0','1','0','1','1','0','1','1','1','0'),
                charArrayOf('0','0','0','0','1','0','0','1','1','0','0','0','0','1','0','0','0','1','0','1'),
                charArrayOf('0','0','1','0','0','1','0','0','0','0','0','1','0','0','1','0','0','0','1','0'),
                charArrayOf('1','0','0','1','0','0','0','0','0','0','0','1','0','0','1','0','1','0','1','0'),
                charArrayOf('0','1','0','0','0','1','0','1','0','1','1','0','1','1','1','0','1','1','0','0'),
                charArrayOf('1','1','0','1','0','0','0','0','1','0','0','0','0','0','0','1','0','0','0','1'),
                charArrayOf('0','1','0','0','1','1','1','0','0','0','1','1','1','1','1','0','1','0','0','0'),
                charArrayOf('0','0','1','1','1','0','0','0','1','1','0','0','0','1','0','1','0','0','0','0'),
                charArrayOf('1','0','0','1','0','1','0','0','0','0','1','0','0','0','1','0','1','0','1','1'),
                charArrayOf('1','0','1','0','0','0','0','0','0','1','0','0','0','1','0','1','0','0','0','0'),
                charArrayOf('0','1','1','0','0','0','1','1','1','0','1','0','1','0','1','1','1','1','0','0'),
                charArrayOf('0','1','0','0','0','0','1','1','0','0','1','0','1','0','0','1','0','0','1','1'),
                charArrayOf('0','0','0','0','0','0','1','1','1','1','0','1','0','0','0','1','1','0','0','0')
            )
        )

        assertEquals(58, numIslands)
    }
}