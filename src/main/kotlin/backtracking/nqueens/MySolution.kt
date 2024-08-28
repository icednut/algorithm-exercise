package backtracking.nqueens

class MySolution {
    fun solveNQueens(n: Int): List<List<String>> {
        val result: MutableList<List<String>> = mutableListOf()

        for (startCol in 0 until n) {
            val queen = 0
            val board = init(n)
            val findResult = solve(board, startCol, n, queen)

            if (n == findResult) {
                result.add(convertResult(board))
            }
        }

        return result
    }

    private fun init(n: Int): MutableList<MutableList<String>> =
        MutableList(
            n,
            { MutableList(n, { "." }) }
        )

    private fun solve(board: MutableList<MutableList<String>>, startCol: Int, n: Int, queen: Int): Int {
        var currentQueen = queen

        if (startCol >= n) {
            return currentQueen
        }

        for (row in 0 until n) {
            val currentStartCol = if (row == 0) startCol else 0

            for (col in currentStartCol until n) {
                if (isSafe(board, row, col, n)) {
                    board[row][col] = "Q"
                    currentQueen++

                    currentQueen = solve(board, col + 1, n, currentQueen)
                }
            }
        }

        return currentQueen
    }

    private fun isSafe(board: MutableList<MutableList<String>>, row: Int, col: Int, n: Int): Boolean {
        for (i in 0 until n) {
            if (board[row][i] == "Q") {
                return false
            }
        }

        for (i in 0 until n) {
            if (board[i][col] == "Q") {
                return false
            }
        }

        var i = row
        var j = col
        while (i >= 0 && j >= 0) {
            if (board[i][j] == "Q") {
                return false
            }
            i--
            j--
        }

        i = row
        j = col
        while (i < n && j >= 0) {
            if (board[i][j] == "Q") {
                return false
            }
            i++
            j--
        }

        i = row
        j = col
        while (i >= 0 && j < n) {
            if (board[i][j] == "Q") {
                return false
            }
            i--
            j++
        }

        i = row
        j = col
        while (i < 0 && j < n) {
            if (board[i][j] == "Q") {
                return false
            }
            i++
            j++
        }

        return true
    }

    private fun convertResult(board: List<List<String>>): List<String> =
        board.map {
            it.joinToString("")
        }
}