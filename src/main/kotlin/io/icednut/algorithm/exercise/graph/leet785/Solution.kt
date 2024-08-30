package io.icednut.algorithm.exercise.graph.leet785

import java.util.*

class Solution {

    fun isBipartite(graph: Array<IntArray>): Boolean {
        val seen = HashSet<Int>()
        val queue = LinkedList<String>()
        val redPartition = HashSet<Int>()
        val greenPartition = HashSet<Int>()
        var isRed = true

        for (vertex in graph.indices) {
            if (graph[vertex].isEmpty()) {
                continue
            }

            queue.addFirst("${vertex},${isRed}")

            var i = vertex

            while (queue.isNotEmpty()) {
                val targetVertex = queue.removeLast().split(",")
                i = targetVertex[0].toInt()
                isRed = targetVertex[1].toBoolean()

                if (i != vertex) {
                    if (isRed && greenPartition.contains(i)) {
                        return false
                    } else if (!isRed && redPartition.contains(i)) {
                        return false
                    }
                }

                if (!seen.contains(i)) {
                    seen.add(i)
                    if (isRed) {
                        redPartition.add(i)
                    } else {
                        greenPartition.add(i)
                    }

                    for (edge in graph[i]) {
                        queue.addFirst("${edge},${!isRed}")
                    }
                }
            }
        }

        return isTwoPartition(redPartition, greenPartition)
    }

    private fun isTwoPartition(redPartition: HashSet<Int>, greenPartition: HashSet<Int>): Boolean {
        if (redPartition.intersect(greenPartition).isNotEmpty()) {
            return false
        }

        return true
    }
}