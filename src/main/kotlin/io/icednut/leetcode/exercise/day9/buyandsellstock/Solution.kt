package io.icednut.leetcode.exercise.day9.buyandsellstock

import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        val cache = Array(prices.size) { -1 }

        fun getMaxPrice(index: Int): Int {
            val maxCost = prices.drop(index).max() ?: 0
            return maxCost - prices[index]
        }

        fun go(index: Int): Int {
            if (index > prices.lastIndex) {
                return 0
            }

            if (cache[index] == -1) {
                cache[index] = max(getMaxPrice(index), go(index + 1))
            }
            return cache[index]
        }

        return go(0)
    }
}