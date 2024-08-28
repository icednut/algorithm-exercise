package io.icednut.algorithm.exercise.graph.leet200

import java.util.LinkedList

class Solution3 {

    fun numIslands(grid: Array<CharArray>): Int {
        val seen = HashSet<String>()
        var count = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (seen.contains("${i},${j}") || grid[i][j] == '0') {
                    continue
                }

                bfs(grid, seen, i, j)
                count += 1
            }
        }
        return count
    }

    private fun bfs(grid: Array<CharArray>, seen: HashSet<String>, i: Int, j: Int) {
        val queue = LinkedList<String>()
        queue.addFirst("${i},${j}")

        while (queue.isNotEmpty()) {
            val targetPosition = queue.removeLast().split(",")
            val x = targetPosition[0].toInt()
            val y = targetPosition[1].toInt()

            if (grid.size <= x || x < 0) {
                continue
            }

            if (grid[i].size <= y || y < 0) {
                continue
            }

            if (!seen.contains("${x},${y}") && grid[x][y] == '1') {
                seen.add("${x},${y}")

                queue.addFirst("${x - 1},${y}")
                queue.addFirst("${x + 1},${y}")
                queue.addFirst("${x},${y - 1}")
                queue.addFirst("${x},${y + 1}")
            }
        }
    }
}