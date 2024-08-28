package txcalulate

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import etc.txcalculate.Solution

class MySolutionTest {

    @Test
    fun test1() {
        val arr = arrayOf("P 300 6", "P 500 3", "S 1000 4", "P 600 2", "S 1200 1")
        val solution = Solution()
        val result = solution.exec(arr)

        assertEquals(1500, result[0])
        assertEquals(2400, result[1])
    }

    @Test
    fun test2() {
        val arr = arrayOf("P 300 6", "P 500 3", "S 1000 6", "P 600 2", "S 1200 2")
        val solution = Solution()
        val result = solution.exec(arr)

        assertEquals(2800, result[0])
        assertEquals(3600, result[1])
    }

    @Test
    fun test3() {
        val arr = arrayOf("P 500 8", "P 400 5", "P 100 2", "S 1000 12", "P 600 2", "S 1200 4")
        val solution = Solution()
        val result = solution.exec(arr)

        assertEquals(6800, result[0])
        assertEquals(6100, result[1])
    }
}