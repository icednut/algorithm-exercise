package io.icednut.algorithm.exercise.graph.leet200.replay

class Solution {

    fun numIslands(grid: Array<CharArray>): Int {
        val seen = HashSet<String>()
        var islandCount = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (seen.contains("${i},${j}")) {
                    continue
                }

                val result = isIsland(grid, i, j, seen)
                if (result == 1) {
                    islandCount += 1
                }
            }
        }

        return islandCount
    }

    private fun isIsland(grid: Array<CharArray>, i: Int, j: Int, seen: HashSet<String>): Int {
        if (grid.size <= i || i < 0) {
            return -1
        } else if (grid[i].size <= j || j < 0) {
            return -1
        }

        if (seen.contains("${i},${j}")) {
            return -1
        }

        seen.add("${i},${j}")

        if (grid[i][j] == '0') {
            return 0
        }

        isIsland(grid, i - 1, j, seen)
        isIsland(grid, i + 1, j, seen)
        isIsland(grid, i, j - 1, seen)
        isIsland(grid, i, j + 1, seen)
        return 1
    }
}