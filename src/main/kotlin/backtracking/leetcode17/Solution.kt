package backtracking.leetcode17

class Solution {
    private val charTable = mapOf(
        "2" to listOf("a", "b", "c"),
        "3" to listOf("d", "e", "f"),
        "4" to listOf("g", "h", "i"),
        "5" to listOf("j", "k", "l"),
        "6" to listOf("m", "n", "o"),
        "7" to listOf("p", "q", "r", "s"),
        "8" to listOf("t", "u", "v"),
        "9" to listOf("w", "x", "y", "z")
    )

    fun letterCombinations(digits: String): List<String> {
        val results = mutableListOf<String>()

        for (i in 0 until digits.length) {
            solve(i, digits, "", results)
        }
        return results
    }

    private fun solve(index: Int, digits: String, letter: String, results: MutableList<String>): String? {
        if (index >= digits.length) {
            if (letter.length == digits.length) {
                return letter
            } else {
                return null
            }
        }

        val digit = digits[index].toString()
        val strings = charTable[digit] ?: listOf()

        for (str in strings) {
            val nextLetter = solve(index + 1, digits, letter + str, results)

            if (nextLetter != null) {
                results.add(nextLetter)
            }
        }
        return null
    }
}