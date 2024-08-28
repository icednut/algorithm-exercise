package io.icednut.algorithm.exercise.old.leetcode.exercise.day00.singlenumberiii

import io.icednut.algorithm.exercise.old.exercise.day00.singlenumberiii.Solution
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * @author will.109
 * @date 2020/04/05
 */
internal class SolutionTest {

    @Test
    fun `single number 모두를 찾을 수 있어야 한다`() {
        val solution = Solution()
        val singleNumber = solution.singleNumber(intArrayOf(1, 2, 1, 3, 2, 5))
        assertTrue(intArrayOf(3, 5) contentEquals singleNumber)
    }
}