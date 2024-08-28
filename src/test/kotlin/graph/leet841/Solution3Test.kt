package graph.leet841

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution3Test {

    @Test
    fun test01() {
        val solution = Solution3()

        val result = solution.canVisitAllRooms(
            arrayListOf(
                arrayListOf(1),
                arrayListOf(2),
                arrayListOf(3),
                arrayListOf()
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test02() {
        val solution = Solution3()

        val result = solution.canVisitAllRooms(
            arrayListOf(
                arrayListOf(1, 3),
                arrayListOf(3, 0, 1),
                arrayListOf(2),
                arrayListOf(0)
            )
        )

        assertEquals(false, result)
    }

    @Test
    fun test03() {
        val solution = Solution3()

        val result = solution.canVisitAllRooms(
            arrayListOf(
                arrayListOf(1, 3),
                arrayListOf(1, 4),
                arrayListOf(2, 3, 4, 1),
                arrayListOf(),
                arrayListOf(4, 3, 2),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test04() {
        val solution = Solution3()

        val result = solution.canVisitAllRooms(
            arrayListOf(
                arrayListOf(6, 7, 8),
                arrayListOf(5, 4, 9),
                arrayListOf(),
                arrayListOf(8),
                arrayListOf(4),
                arrayListOf(),
                arrayListOf(1, 9, 2, 3),
                arrayListOf(7),
                arrayListOf(6, 5),
                arrayListOf(2, 3, 1),
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun test05() {
        val solution = Solution3()

        val result = solution.canVisitAllRooms(
            arrayListOf(
                arrayListOf(1),
                arrayListOf(2),
                arrayListOf(2),
                arrayListOf(),
            )
        )

        assertEquals(false, result)
    }
}