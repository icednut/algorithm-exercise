package graph.leet200

class Solution2 {

    fun numIslands(grid: Array<CharArray>): Int {
        val seen = HashSet<String>()
        var count = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '0' || seen.contains("${i},${j}")) {
                    continue
                }

                dfs(grid, seen, i, j)
                count += 1
            }
        }
        return count
    }

    private fun dfs(grid: Array<CharArray>, seen: HashSet<String>, i: Int, j: Int) {
        if (grid.size <= i || i < 0) {
            return
        }

        if (grid[i].size <= j || j < 0) {
            return
        }

        val land = grid[i][j]

        if (!seen.contains("${i},${j}") && land == '1') {
            seen.add("${i},${j}")

            dfs(grid, seen, i + 1, j)
            dfs(grid, seen, i - 1, j)
            dfs(grid, seen, i, j + 1)
            dfs(grid, seen, i, j - 1)
        }
    }
}