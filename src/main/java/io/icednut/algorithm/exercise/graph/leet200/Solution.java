package io.icednut.algorithm.exercise.graph.leet200;

import java.util.HashSet;

class Solution {

    public int numIslands(char[][] grid) {
        var seen = new HashSet<String>();
        var count = 0;

        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                if (seen.contains("%d,%d".formatted(i, j))) {
                    continue;
                }
                dfs(i, j, grid, seen);

                if (grid[i][j] == '1') {
                    count += 1;
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j, char[][] grid, HashSet<String> seen) {
        if (i >= grid.length || i < 0) {
            return;
        }
        if (j >= grid[i].length || j < 0) {
            return;
        }

        if (seen.contains("%d,%d".formatted(i, j))) {
            return;
        }
        seen.add("%d,%d".formatted(i, j));

        if (grid[i][j] == '1') {
            dfs(i + 1, j, grid, seen);
            dfs(i - 1, j, grid, seen);
            dfs(i, j + 1, grid, seen);
            dfs(i, j - 1, grid, seen);
        }
    }
}