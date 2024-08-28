package io.icednut.algorithm.exercise.backtracking.nqueens

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MySolutionTest {

    @Test
    fun `서로 공격할 수 없도록 Queen을 배치해보자 n = 4`() {
        val solution = MySolution()
        val result = solution.solveNQueens(4)

        println("Test 1")
        result.forEach(::println)

        assertEquals(2, result.size)
        assertEquals(listOf(".Q..","...Q","Q...","..Q."), result[0])
        assertEquals(listOf("..Q.","Q...","...Q",".Q.."), result[1])
    }

    @Test
    fun `서로 공격할 수 없도록 Queen을 배치해보자 n = 5`() {
        val solution = MySolution()
        val result = solution.solveNQueens(5)

        println("Test 2")
        result.forEach(::println)

        assertEquals(10, result.size)
        assertEquals(listOf("Q....","..Q..","....Q",".Q...","...Q."), result[0])
        assertEquals(listOf("Q....","...Q.",".Q...","....Q","..Q.."), result[1])
        assertEquals(listOf(".Q...","...Q.","Q....","..Q..","....Q"), result[2])
        assertEquals(listOf(".Q...","....Q","..Q..","Q....","...Q."), result[3])
        assertEquals(listOf("..Q..","Q....","...Q.",".Q...","....Q"), result[4])
        assertEquals(listOf("..Q..","....Q",".Q...","...Q.","Q...."), result[5])
        assertEquals(listOf("...Q.","Q....","..Q..","....Q",".Q..."), result[6])
        assertEquals(listOf("...Q.",".Q...","....Q","..Q..","Q...."), result[7])
        assertEquals(listOf("....Q",".Q...","...Q.","Q....","..Q.."), result[8])
        assertEquals(listOf("....Q","..Q..","Q....","...Q.",".Q..."), result[9])
    }
}