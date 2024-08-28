package io.icednut.algorithm.exercise.graph.leet733

import java.util.*

class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val stack = Stack<String>()
        val seen = HashSet<String>()
        val result = image.map {
            it.toMutableList()
        }
        val beforeColor = image[sr][sc]

        stack.push("${sr},${sc}")

        while (stack.isNotEmpty()) {
            val nextPos = stack.pop().split(",")
            val x = nextPos[0].toInt()
            val y = nextPos[1].toInt()

            if (result.size <= x || x < 0) {
                continue
            }

            if (result[x].size <= y || y < 0) {
                continue
            }

            val targetColor = result[x][y]

            if (!seen.contains("${x},${y}") && targetColor == beforeColor) {
                seen.add("${x},${y}")

                if (targetColor != color) {
                    result[x][y] = color
                }
                stack.push("${x - 1},${y}")
                stack.push("${x + 1},${y}")
                stack.push("${x},${y - 1}")
                stack.push("${x},${y + 1}")
            }
        }

        return result.map {
            it.toIntArray()
        }.toTypedArray()
    }
}