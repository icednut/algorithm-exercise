package io.icednut.algorithm.exercise.graph.leet1091;

import java.util.LinkedList;

class LeetSolution {

    private static final int[][] directions = new int[][]{
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1},
            {-1, -1},
            {-1, 1},
            {1, -1},
            {1, 1}
    };

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (n == 0 || grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        var queue = new LinkedList<int[]>();
        grid[0][0] = 1; // mark starting point as visited
        queue.offer(new int[]{0, 0, 1});

        while (!queue.isEmpty()) {
            var node = queue.poll();
            int x = node[0];
            int y = node[1];
            int distance = node[2];

            if (x == n - 1 && y == n - 1) {
                return distance;
            }

            for (int[] direction : directions) {
                int newX = direction[0] + x;
                int newY = direction[1] + y;

                if (newX >= 0 && newX < n && newY >= 0 && newY < n && grid[newX][newY] == 0) {
                    grid[newX][newY] = distance + 1;
                    queue.offer(new int[]{newX, newY, distance + 1});
                }
            }
        }
        return -1;
    }
}