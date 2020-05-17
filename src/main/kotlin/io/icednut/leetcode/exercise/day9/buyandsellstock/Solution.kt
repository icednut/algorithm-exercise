package io.icednut.leetcode.exercise.day9.buyandsellstock

import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        val cache = Array(prices.size + 1) { -1 }

        fun go(nextPrices: IntArray, targetPrice: Int, index: Int): Int {
            if (index > nextPrices.lastIndex) {
                return 0
            }

            val currentProfit = nextPrices[index] - targetPrice
            var result = 0

            if (cache[index + 1] == -1) {
                result = max(currentProfit, go(nextPrices, targetPrice, index + 1))
                cache[index + 1] = result
            } else {
                result = cache[index + 1]
            }
            return result
        }

        val minPrice = prices.min() ?: return 0
        val minPriceIndex = prices.indexOf(minPrice)

        return go(prices, minPrice, minPriceIndex)
    }
}