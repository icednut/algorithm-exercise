package io.icednut.algorithm.exercise.etc.leet2028

class Solution {

    fun missingRolls(rolls: IntArray, mean: Int, n: Int): IntArray {
        val mSum = rolls.sum()
        val totalSize = rolls.size + n
        val targetSum = (mean * totalSize) - mSum

        val minimumValue = targetSum / n

        if (minimumValue > 6 || minimumValue <= 0) {
            return intArrayOf()
        }

        var result = IntArray(n, { minimumValue })

        val restValue = targetSum % n
        if (restValue > 0 && minimumValue < 6) {
            val restArr = getRestArray(targetSum - (minimumValue * n), n)

            if (restArr.isEmpty()) {
                return intArrayOf()
            }

            result = plusArr(result, restArr)
        } else if (restValue == 0) {
            return result
        } else {
            return intArrayOf()
        }

        return result
    }

    private fun plusArr(result: IntArray, restArr: IntArray): IntArray {
        val plusedResult = result.copyOf()

        for (i in result.indices) {
            plusedResult[i] = result[i] + restArr[i]
        }
        return plusedResult
    }

    private fun getRestArray(targetSum: Int, n: Int): IntArray {
        val restArr = IntArray(n)
        var target = targetSum
        var i = 0

        while (target > 0) {
            target -= 1
            restArr[i] += 1

            if (i == restArr.lastIndex) {
                i = 0
            } else {
                i += 1
            }
        }
        return restArr
    }
}