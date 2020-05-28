package io.icednut.leetcode.exercise.day09.buyandsellstock

import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        val cache = Array(prices.size) { -1 }

        fun getMaxPrice(index: Int, maxIndex: Int): Pair<Int?, Int> {
            val maxValuePair = if (index > maxIndex) {
                prices
                    .mapIndexed { idx, value -> Pair(idx, value) }
                    .maxWith(Comparator { o1, o2 ->
                        if (o1.first < index) {
                            -1
                        } else {
                            when {
                                o1.second > o2.second -> 1
                                o1.second == o2.second -> 0
                                else -> -1
                            }
                        }
                    })
            } else {
                Pair(maxIndex, prices[maxIndex])
            }
            val maxCost = maxValuePair?.second ?: 0
            return Pair(maxValuePair?.first, maxCost - prices[index])
        }

        fun go(index: Int, maxIndex: Int): Int {
            if (index > prices.lastIndex) {
                return 0
            }

            if (cache[index] == -1) {
                val maxValuePair = getMaxPrice(index, maxIndex)
                val maxValueIndex = maxValuePair.first ?: 0
                cache[index] = max(maxValuePair.second, go(index + 1, maxValueIndex))
            }
            return cache[index]
        }

        return go(0, -1)
    }
}