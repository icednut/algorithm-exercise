package io.icednut.algorithm.exercise.backtracking.leetcode78

class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        fun solve(index: Int, letters: MutableList<Int>) {
            if (index == nums.size) {
                result.add(letters.toList())
                return
            }

            val num = nums[index]
            letters.add(num)
            solve(index + 1, letters)
            letters.removeLast()
            solve(index + 1, letters)
        }

        solve(0, mutableListOf())
        return result
    }
}