package io.icednut.algorithm.exercise.graph.leet785.replay

class Solution {

    fun isBipartite(graph: Array<IntArray>): Boolean {
        val seen = HashSet<Int>()
        val red = HashSet<Int>()
        val green = HashSet<Int>()

        val n = 4
        for (i in n - 1 downTo  0) {

        }

        for (vertex in graph.indices) {
            if (!dfs(graph, vertex, seen, red, green, true)) {
                return false
            }
        }

        return check(graph.size, red, green)
    }

    private fun check(size: Int, red: HashSet<Int>, green: HashSet<Int>): Boolean {
        if (red.intersect(green.asIterable().toSet()).isNotEmpty()) {
            return false
        }
        return true
    }

    private fun isAlreayPartitioned(neighbors: IntArray, vertex: Int, red: HashSet<Int>, green: HashSet<Int>): Boolean {
        if (green.contains(vertex)) {
            return neighbors.any { green.contains(it) }
        } else if (red.contains(vertex)) {
            return neighbors.any { red.contains(it) }
        }
        return false
    }

    private fun dfs(
        graph: Array<IntArray>,
        vertex: Int,
        seen: HashSet<Int>,
        red: HashSet<Int>,
        green: HashSet<Int>,
        isRed: Boolean
    ): Boolean {
        if (seen.contains(vertex)) {
            if (isAlreayPartitioned(graph[vertex], vertex, red, green)) {
                return false
            } else {
                return true
            }
        }

        seen.add(vertex)

        if (isRed) {
            red.add(vertex)
        } else {
            green.add(vertex)
        }

        for (neighbor in graph[vertex]) {
            if (!dfs(graph, neighbor, seen, red, green, !isRed)) {
                return false
            }
        }
        return true
    }
}