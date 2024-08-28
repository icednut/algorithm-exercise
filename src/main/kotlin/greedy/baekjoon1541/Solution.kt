package greedy.baekjoon1541

class Solution {

    fun find(line: String): Int {
        val nums = line.split("+").flatMap {
            it.split("-")
        }

        var targetLine = line
        var sumNums = mutableListOf(0)
        val minusNums = mutableListOf<Int>()

        for (num in nums) {
            val element = targetLine.removePrefix(num)
            val operator = if (element.length == 0) "" else element.substring(0, 1)
            targetLine = targetLine.removePrefix(num).removePrefix(operator)

            if (operator == "-") {
                sumNums.add(num.toInt())
                minusNums.add(sumNums.sum())
                sumNums = mutableListOf(0)
            } else if (operator == "+") {
                sumNums.add(num.toInt())
            } else if (operator == "") {
                val temp = line.removeSuffix(num)
                val lastOperator = if (temp == "") "" else temp.substring(temp.length - 1, temp.length)

                if (lastOperator == "-") {
                    minusNums.add(sumNums.sum())
                    minusNums.add(num.toInt())
                } else if (lastOperator == "+") {
                    sumNums.add(num.toInt())
                    minusNums.add(sumNums.sum())
                } else if (lastOperator == "") {
                    sumNums.add(num.toInt())
                }
            }
        }

        return if (minusNums.isEmpty()) sumNums.sum() else minusNums.reduce { a, b -> a - b}
    }
}

fun main(args: Array<String>) {
    val line = readLine() ?: ""

    val solution = Solution()
    val result = solution.find(line)

    println(result)
}