package io.icednut.algorithm.exercise.graph.leet1091;

import java.util.HashSet;

class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        if (grid[0][0] == 1 || getLast(grid) == 1) {
            return -1;
        }

        var seen = new HashSet<String>();

        dfs(0, 0, 1, grid, seen);
        return getLast(grid);
    }

    private static int getLast(int[][] grid) {
        return grid[grid.length - 1][grid[grid.length - 1].length - 1];
    }

    private void dfs(int x, int y, int pathVal, int[][] grid, HashSet<String> seen) {
        if (x >= grid.length || x < 0) {
            return;
        }
        if (y >= grid[x].length || y < 0) {
            return;
        }

//        if (seen.contains("%d,%d".formatted(x, y))) {
//            return;
//        }
//
//        seen.add("%d,%d".formatted(x, y));

        if (grid[x][y] == 0 || grid[x][y] == pathVal) {
            grid[x][y] = pathVal;
            var nextPathVal = pathVal + 1;
            markAround(x, y, grid, nextPathVal);

            dfs(x - 1, y - 1, nextPathVal, grid, seen);
            dfs(x, y - 1, nextPathVal, grid, seen);
            dfs(x + 1, y - 1, nextPathVal, grid, seen);
            dfs(x - 1, y, nextPathVal, grid, seen);
            dfs(x + 1, y, nextPathVal, grid, seen);
            dfs(x - 1, y + 1, nextPathVal, grid, seen);
            dfs(x, y + 1, nextPathVal, grid, seen);
            dfs(x + 1, y + 1, nextPathVal, grid, seen);
        }
    }

    private static final int[][] aroundPaths = new int[][]{
            new int[]{-1, -1},
            new int[]{0, -1},
            new int[]{1, -1},
            new int[]{-1, 0},
            new int[]{1, 0},
            new int[]{-1, 1},
            new int[]{0, 1},
            new int[]{1, 1}
    };

    private void markAround(int x, int y, int[][] grid, int pathVal) {
        for (var paths : aroundPaths) {
            int newX = paths[0] + x;
            int newY = paths[1] + y;

            if (newX >= grid.length || newX < 0) {
                continue;
            }
            if (newY >= grid[newX].length || newY < 0) {
                continue;
            }

            if (grid[newX][newY] == 0) {
                grid[newX][newY] = pathVal;
            }
        }
    }
}