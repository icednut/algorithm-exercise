package io.icednut.leetcode.exercise.singlenumber

class Solution {
    fun singleNumber(nums: IntArray): Int = nums.asSequence()
        .groupBy { it }
        .mapValues { it.value.size }
        .entries
        .find { it.value == 1 }?.key ?: 0
}