package io.icednut.algorithm.exercise.graph.leet1091;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution {

    private static final String queueFormat = "%d,%d,%d";
    private static final String seenFormat = "%d,%d";
    private static final List<String> targets = Arrays.asList(
            "-1,-1",
            "-1,0",
            "-1,1",
            "0,-1",
            "0,1",
            "1,-1",
            "1,0",
            "1,1"
    );

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        if (grid[0][0] == 1 || getLast(grid) == 1) {
            return -1;
        }

        bfs(0, 0, grid);
        return getLast(grid);
    }

    private static int getLast(int[][] grid) {
        int lastPathVal = grid[grid.length - 1][grid[grid.length - 1].length - 1];

        if (lastPathVal == 0) {
            return -1;
        }
        return lastPathVal;
    }

    private void bfs(int x, int y, int[][] grid) {
        var queue = new LinkedList<String>();
        var seen = new HashSet<String>();

        queue.addFirst(queueFormat.formatted(x, y, 1));

        while (!queue.isEmpty()) {
            var positions = queue.poll().split(",");
            var newX = Integer.parseInt(positions[0]);
            var newY = Integer.parseInt(positions[1]);
            var newPathVal = Integer.parseInt(positions[2]);

            if (isInvalidPos(newX, newY, grid)) {
                continue;
            }
            if (!seen.contains(seenFormat.formatted(newX, newY))) {
                if (grid[newX][newY] == 0) {
                    grid[newX][newY] = newPathVal;
                    newPathVal += 1;

                    queue.offer(queueFormat.formatted(newX - 1, newY - 1, newPathVal));
                    queue.offer(queueFormat.formatted(newX - 1, newY, newPathVal));
                    queue.offer(queueFormat.formatted(newX - 1, newY + 1, newPathVal));
                    queue.offer(queueFormat.formatted(newX, newY - 1, newPathVal));
                    queue.offer(queueFormat.formatted(newX, newY + 1, newPathVal));
                    queue.offer(queueFormat.formatted(newX + 1, newY - 1, newPathVal));
                    queue.offer(queueFormat.formatted(newX + 1, newY, newPathVal));
                    queue.offer(queueFormat.formatted(newX + 1, newY + 1, newPathVal));
                }
                seen.add(seenFormat.formatted(newX, newY));
            }
        }
    }

    private Boolean isInvalidPos(int x, int y, int[][] grid) {
        if (x >= grid.length || x < 0) {
            return true;
        }
        if (y >= grid[x].length || y < 0) {
            return true;
        }
        return false;
    }
}