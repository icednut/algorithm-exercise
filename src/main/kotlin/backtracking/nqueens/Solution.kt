package backtracking.nqueens

class Solution {
    fun solveNQueens(n: Int): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val board = Array(n) { CharArray(n) { '.' } }

        fun isSafe(row: Int, col: Int): Boolean {
            for (i in 0 until col) {
                if (board[row][i] == 'Q') return false
            }

            var i = row
            var j = col
            while (i >= 0 && j >= 0) {
                if (board[i][j] == 'Q') return false
                i--
                j--
            }

            i = row
            j = col
            while (i < n && j >= 0) {
                if (board[i][j] == 'Q') return false
                i++
                j--
            }

            return true
        }

        fun solve(col: Int) {
            if (col >= n) {
                result.add(board.map { it.joinToString("") })
                return
            }

            for (i in 0 until n) {
                if (isSafe(i, col)) {
                    board[i][col] = 'Q'
                    solve(col + 1)
                    board[i][col] = '.'
                }
            }
        }

        solve(0)
        return result
    }
}