package io.icednut.algorithm.exercise.graph.leet841

class Solution3 {

    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val seen = HashSet<Int>()

        fun go(index: Int) {
            seen.add(index)
            val roomKeys = rooms[index]

            for (roomKey in roomKeys) {
                if (!seen.contains(roomKey)) {
                    go(roomKey)
                }
            }
        }
        go(0)
        return seen.size == rooms.size
    }
}