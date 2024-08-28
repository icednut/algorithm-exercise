package io.icednut.algorithm.exercise.graph.leet841

import java.util.*

class Solution2 {

    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val seen = dfsWithStack(rooms)

        return seen.size == rooms.size
    }

    private fun dfsWithStack(rooms: List<List<Int>>): HashSet<Int> {
        val stack = Stack<Int>()
        val seen = HashSet<Int>()
        val result = arrayListOf<Int>()

        if (rooms.isNotEmpty()) {
            stack.push(0)

            traverse(rooms, stack, seen, result)
        }
        return seen
    }

    private fun traverse(
        rooms: List<List<Int>>,
        stack: Stack<Int>,
        seen: HashSet<Int>,
        result: ArrayList<Int>
    ) {
        while (stack.isNotEmpty()) {
            val traverseTargetNum = stack.pop()

            if (!seen.contains(traverseTargetNum)) {
                seen.add(traverseTargetNum)
                result.add(traverseTargetNum)
                val nextRoomKeys = rooms[traverseTargetNum]

                for (nextRoomKey in nextRoomKeys) {
                    stack.push(nextRoomKey)
                }
            }
        }
    }
}
