package io.icednut.algorithm.exercise.greedy.leetcode1578

class Solution {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        val sortedCosts = costs.sortedWith(compareBy {
            val i = it[0] - it[1]
            i
        })

        val temp = costs.map { it[0] - it[1] }

        val n = costs.size / 2
        var totalCost = 0

        for (i in 0 until n) {
            totalCost += sortedCosts[i][0]
        }

        for (i in n until sortedCosts.size) {
            totalCost += sortedCosts[i][1]
        }

        return totalCost
    }
}