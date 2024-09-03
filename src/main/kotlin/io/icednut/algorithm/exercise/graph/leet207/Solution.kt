package io.icednut.algorithm.exercise.graph.leet207

import java.util.*

class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph = convertGraph(numCourses, prerequisites)
        val seen = HashSet<Int>()

        for (subject in 0 until numCourses) {
            val cyclePath = HashSet<Int>()

            if (hasCycle(graph, subject, seen, cyclePath)) {
                return false
            }
        }
        return true
    }

    private fun convertGraph(numCourses: Int, prerequisites: Array<IntArray>): Array<IntArray> {
        val graph = Array(numCourses, { intArrayOf() })

        for (prerequisite in prerequisites) {
            val nextSubject = prerequisite[0]
            val prevSubject = prerequisite[1]

            graph[prevSubject] = graph[prevSubject].plus(nextSubject)
        }

        return graph
    }

    private fun hasCycle(
        graph: Array<IntArray>,
        subject: Int,
        seen: HashSet<Int>,
        cyclePath: HashSet<Int>
    ): Boolean {
        seen.add(subject)
        cyclePath.add(subject)

        for (nextSubject in graph[subject]) {
            if (!seen.contains(nextSubject) && hasCycle(graph, nextSubject, seen, cyclePath)) {
                return true
            } else if (cyclePath.contains(nextSubject)) {
                return true
            }
        }
        cyclePath.remove(subject)
        return false
    }
}