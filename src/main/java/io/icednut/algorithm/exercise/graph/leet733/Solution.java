package io.icednut.algorithm.exercise.graph.leet733;

import java.util.HashSet;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        var pastColor = image[sr][sc];
        var seen = new HashSet<String>();

        dfs(sr, sc, image, seen, pastColor, color);
        return image;
    }

    private int[][] init(int[][] image) {
        var result = new int[image.length][];

        for (var i = 0; i < image.length; i++) {
            result[i] = new int[image[i].length];
        }
        return result;
    }

    private void dfs(int sr, int sc, int[][] image, HashSet<String> seen, int pastColor, int color) {
        if(sr >= image.length || sr < 0) {
            return;
        }
        if (sc >= image[sr].length || sc < 0) {
            return;
        }

        if (seen.contains("%d,%d".formatted(sr, sc))) {
            return;
        }

        seen.add("%d,%d".formatted(sr, sc));

        if (image[sr][sc] == pastColor) {
            image[sr][sc] = color;
            dfs(sr - 1, sc, image, seen, pastColor, color);
            dfs(sr + 1, sc, image, seen, pastColor, color);
            dfs(sr, sc - 1, image, seen, pastColor, color);
            dfs(sr, sc + 1, image, seen, pastColor, color);
        }
    }
}