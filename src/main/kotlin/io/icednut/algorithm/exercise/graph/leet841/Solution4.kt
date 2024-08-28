package io.icednut.algorithm.exercise.graph.leet841

import java.util.LinkedList

class Solution4 {

    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val seen = HashSet<Int>()
        val queue = LinkedList<Int>()

        if (rooms.isNotEmpty()) {
            queue.addLast(0)

            while (queue.isNotEmpty()) {
                val targetRoom = queue.removeFirst()
                seen.add(targetRoom)

                val roomKeys = rooms[targetRoom]

                for (roomKey in roomKeys) {
                    if (!seen.contains(roomKey)) {
                        queue.addLast(roomKey)
                    }
                }
            }
        }
        return seen.size == rooms.size
    }
}