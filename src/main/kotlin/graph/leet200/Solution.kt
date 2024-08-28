package graph.leet200

import java.util.*
import kotlin.collections.HashSet

class Solution {

    fun numIslands(grid: Array<CharArray>): Int {
        val stack = Stack<String>()
        val seen = HashSet<String>()
        var countOfIslands = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '0') {
                    continue
                }

                stack.push("${i},${j}")
                while (stack.isNotEmpty()) {
                    val poppedPosition = stack.pop().split(",")
                    val x: Int = poppedPosition[0].toInt()
                    val y: Int = poppedPosition[1].toInt()

                    val land = grid[x][y]
                    if (!seen.contains("${i},${j}") && land == '1') {
                        stack.push("${x + 1},${y}")
                        stack.push("${x - 1},${y}")
                        stack.push("${x}${y + 1}")
                        stack.push("${x}${y - 1}")
                    }
                }
                countOfIslands += 1
            }
        }

        return countOfIslands
    }
}