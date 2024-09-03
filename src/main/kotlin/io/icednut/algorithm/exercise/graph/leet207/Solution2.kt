package io.icednut.algorithm.exercise.graph.leet207

class Solution2 {

    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph = convertGraph(numCourses, prerequisites)
        val seen = IntArray(numCourses)

        fun hasCycle(course: Int): Boolean {
            if (seen[course] == 1) {
                return true // 순환이 존재
            }
            if (seen[course] == 2) {
                return false // 이미 방문 완료된 노드
            }

            seen[course] = 1 // 방문 중으로 표시
            for (nextCourse in graph[course]) {
                if (hasCycle(nextCourse)) {
                    return true
                }
            }
            seen[course] = 2
            return false
        }

        for (course in 0 until numCourses) {
            if (hasCycle(course)) {
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
}