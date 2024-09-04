package io.icednut.algorithm.exercise.graph.leet733.replay

class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val seen = HashSet<String>()
        val originalColor = image[sr][sc]

        dfs(image, seen, sr, sc, originalColor, color)

        return image
    }

    private fun dfs(
        image: Array<IntArray>,
        seen: HashSet<String>,
        sr: Int,
        sc: Int,
        originalColor: Int,
        color: Int
    ) {
        if (image.size <= sr || sr < 0) {
            return
        }
        if (image[sr].size <= sc || sc < 0) {
            return
        }

        if (seen.contains("${sr},${sc}")) {
            return
        }

        seen.add("${sr},${sc}")

        if (image[sr][sc] == originalColor) {
            image[sr][sc] = color
        } else {
            return
        }

        dfs(image, seen, sr - 1, sc, originalColor, color)
        dfs(image, seen, sr + 1, sc, originalColor, color)
        dfs(image, seen, sr, sc - 1, originalColor, color)
        dfs(image, seen, sr, sc + 1, originalColor, color)
    }
}