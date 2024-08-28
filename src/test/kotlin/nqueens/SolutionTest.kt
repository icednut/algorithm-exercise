package nqueens

import backtracking.nqueens.Solution
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `서로 공격할 수 없도록 Queen을 배치해보자 n = 4`() {
        val solution = Solution()
        val result = solution.solveNQueens(4)

        println("Test 1")
        result.forEach(::println)

        assertEquals(2, result.size)

        assertTrue(result.contains(listOf(".Q..","...Q","Q...","..Q.")))
        assertTrue(result.contains(listOf("..Q.","Q...","...Q",".Q..")))
    }

    @Test
    fun `서로 공격할 수 없도록 Queen을 배치해보자 n = 5`() {
        val solution = Solution()
        val result = solution.solveNQueens(5)

        println("Test 2")
        result.forEach(::println)

        assertEquals(10, result.size)
        assertTrue(result.contains(listOf("Q....","..Q..","....Q",".Q...","...Q.")))
        assertTrue(result.contains(listOf("Q....","...Q.",".Q...","....Q","..Q..")))
        assertTrue(result.contains(listOf(".Q...","...Q.","Q....","..Q..","....Q")))
        assertTrue(result.contains(listOf(".Q...","....Q","..Q..","Q....","...Q.")))
        assertTrue(result.contains(listOf("..Q..","Q....","...Q.",".Q...","....Q")))
        assertTrue(result.contains(listOf("..Q..","....Q",".Q...","...Q.","Q....")))
        assertTrue(result.contains(listOf("...Q.","Q....","..Q..","....Q",".Q...")))
        assertTrue(result.contains(listOf("...Q.",".Q...","....Q","..Q..","Q....")))
        assertTrue(result.contains(listOf("....Q",".Q...","...Q.","Q....","..Q..")))
        assertTrue(result.contains(listOf("....Q","..Q..","Q....","...Q.",".Q...")))
    }
}