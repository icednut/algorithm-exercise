package io.icednut.algorithm.exercise.graph.leet207

import java.util.*

class Solution3 {

    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph = convertGraph(numCourses, prerequisites)
        val seen = IntArray(numCourses)

        for (subject in 0 until numCourses) {
            if (hasCycle(graph, subject, seen)) {
                return false
            }
        }

        return true
    }

    private fun hasCycle(graph: Array<MutableList<Int>>, subject: Int, seen: IntArray): Boolean {
        val stack = Stack<Int>()
        stack.push(subject)

        while (stack.isNotEmpty()) {
            val node = stack.peek()

            if (seen[node] == 0) {
                seen[node] = 1
            }

            var allNeighborsVisited = true
            for (neighbor in graph[node]) {
                if (seen[neighbor] == 0) {
                    stack.push(neighbor)
                    allNeighborsVisited = false
                } else if (seen[neighbor] == 1) {
                    return true
                }
            }

            if (allNeighborsVisited) {
                seen[node] = 2
                stack.pop()
            }
        }

        return false
    }

    private fun convertGraph(numCourses: Int, prerequisites: Array<IntArray>): Array<MutableList<Int>> {
        val graph = Array(numCourses) { mutableListOf<Int>() }

        for (prerequisite in prerequisites) {
            val nextSubject = prerequisite[0]
            val prevSubject = prerequisite[1]
            graph[prevSubject].add(nextSubject)
        }

        return graph
    }
}