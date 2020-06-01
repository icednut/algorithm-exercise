package io.icednut.leetcode.exercise.day10.longestincreasingsubsequence

class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val cache = Array(nums.size) { listOf<Int>() }

        for (i in 0..nums.lastIndex) {
            val lis = go(cache[i], nums, i)
            cache[i] = lis
        }
        return cache.maxBy { it.size }?.size ?: 0
    }

    private fun go(lis: List<Int>, nums: IntArray, startIndex: Int): List<Int> {
        var lastStepValue = if (lis.isNotEmpty()) lis.last() else -1
        var addIndex = 0
        var newLis = lis

        for (i in startIndex..nums.lastIndex) {
            if (nums[i] > lastStepValue) {
                lastStepValue = nums[i]
                newLis = newLis + lastStepValue
                addIndex += 1
            }
            if (nums[i] > nums[startIndex]
                && lastStepValue > nums[i]
                && isNewMaxLis(nums, i, newLis)
            ) {
                newLis = newLis.filter { it < nums[i] }
                newLis = newLis + nums[i]
            }
        }
        return newLis
    }

    private fun isNewMaxLis(nums: IntArray, index: Int, currentLis: List<Int>): Boolean {
        val newLis = go(currentLis.filter { it < nums[index] }, nums, index)
        val pastLis = go(currentLis, nums, index)

        return newLis.size >= pastLis.size
    }
}
