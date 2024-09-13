package io.icednut.algorithm.exercise.graph.leet733;

public class LeetSolution {
    int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor == color) return image;
        image[sr][sc] = color;
        for(int[] dir: directions) {
            int row = sr+dir[0];
            int col = sc+dir[1];
            if(isSafe(image, row, col) && image[row][col] == originalColor) {
                floodFill(image, row, col, color);
            }
        }
        return image;
    }

    private boolean isSafe(int[][] image, int row, int col) {
        return row >=0 && row <image.length && col >= 0 && col < image[row].length;
    }
}