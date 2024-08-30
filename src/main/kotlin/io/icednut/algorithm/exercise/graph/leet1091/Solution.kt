package io.icednut.algorithm.exercise.graph.leet1091

import java.util.*

class Solution {

    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        var i = 0
        var j = 0

        if (grid[i][j] == 1 || getLastLand(grid) == 1) {
            return -1
        }

        val seen = HashSet<String>()
        val queue = LinkedList<String>()
        var nextPathValue = 1
        queue.addFirst("${i},${j},${nextPathValue}")

        while (queue.isNotEmpty()) {
            val targetPos = queue.removeLast().split(",")
            i = targetPos[0].toInt()
            j = targetPos[1].toInt()
            nextPathValue = targetPos[2].toInt()

            if (grid.size <= i || i < 0) {
                continue
            }

            if (grid[i].size <= j || j < 0) {
                continue
            }

            val land = grid[i][j]

            if (!seen.contains("${i},${j}")) {
                if (land == 0) {
                    grid[i][j] = nextPathValue
                    nextPathValue += 1

                    queue.addFirst("${i - 1},${j - 1},${nextPathValue}")
                    queue.addFirst("${i - 1},${j},${nextPathValue}")
                    queue.addFirst("${i - 1},${j + 1},${nextPathValue}")
                    queue.addFirst("${i},${j - 1},${nextPathValue}")
                    queue.addFirst("${i},${j + 1},${nextPathValue}")
                    queue.addFirst("${i + 1},${j - 1},${nextPathValue}")
                    queue.addFirst("${i + 1},${j},${nextPathValue}")
                    queue.addFirst("${i + 1},${j + 1},${nextPathValue}")
                }

                seen.add("${i},${j}")
            }
        }

        val lastLand = getLastLand(grid)

        if (lastLand == 0) {
            return -1
        } else {
            return lastLand
        }
    }

    private fun getLastLand(grid: Array<IntArray>): Int =
        grid[grid.lastIndex][grid[grid.lastIndex].lastIndex]
}