package io.icednut.algorithm.exercise.graph.leet841

import java.util.*

class Solution {

    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val stack = Stack<Int>()
        val seen = HashSet<Int>()
        val result = ArrayList<Int>()

        if (rooms.isNotEmpty()) {
            result.add(0)
            result.addAll(rooms[0])
            seen.add(0)
        }

        for (currentRoomKey in rooms.indices) {
            val roomKeys = rooms[currentRoomKey]

            if (roomKeys.isEmpty()) {
                seen.add(currentRoomKey)
            } else {
                for (roomKey in roomKeys) {
                    stack.push(roomKey)
                    seen.add(roomKey)
                }
            }

            while(true) {
                val targetRoom = if (stack.isEmpty()) {
                    null
                } else {
                    stack.pop()
                }

                if (targetRoom != null) {
                    val traverseTargetRooms = rooms[targetRoom]

                    for (roomKey in traverseTargetRooms) {
                        if (seen.contains(roomKey)) {
                            continue
                        }
                        stack.push(roomKey)
                        seen.add(roomKey)
                        result.add(roomKey)
                    }
                } else {
                    break
                }
            }

        }

        return result.containsAll(seen)
    }
}