package io.icednut.algorithm_study.day01

class Solution {
    // Solution 1: X
//    fun largestNumber(nums: IntArray): String {
//        val number = nums.joinToString("").toLong()
//        val reversedNumber = nums.reversedArray().joinToString("").toLong()
//
//        return if (number > reversedNumber) {
//            number.toString()
//        } else {
//            reversedNumber.toString()
//        }
//    }

    // Solution 2
    fun largestNumber(nums: IntArray): String {
        val result1 = getLargestNum(nums, 0)

        val nextNums = remove(nums, result1?.second?:0)
        val result2 = if (nextNums.size == 1) {
            Pair(nextNums[0], 0)
        } else if (nextNums.isEmpty()) {
            null
        } else {
            getLargestNum(nextNums, result1?.second?.minus(1))
        }

        if (result2 == null) {
            val nextResultStr = result2?.first?:""
            return result1?.first.toString() + nextResultStr
        }

        val nextNums2 = remove(nextNums, result2?.second?:0)
        val result3 = if (nextNums2.size == 1) {
            Pair(nextNums2[0], 0)
        } else if (nextNums2.isEmpty()) {
            null
        } else {
            getLargestNum(nextNums2, result2?.second?.minus(1))
        }

        if (result3 == null) {
            val nextResultStr = result3?.first?:""
            return result1?.first.toString() + result2?.first.toString() + nextResultStr
        }

        val nextNums3 = remove(nextNums2, result3?.second?:0)
        val result4 = if (nextNums3.size == 1) {
            Pair(nextNums3[0], 0)
        } else if (nextNums3.isEmpty()) {
            null
        } else {
            getLargestNum(nextNums3, result3?.second?.minus(1))
        }

        if (result4 == null) {
            val nextResultStr = result4?.first?:""
            return result1?.first.toString() + result2?.first.toString() + result3?.first.toString() + nextResultStr
        }

        val nextNums4 = remove(nextNums3, result4?.second?:0)
        val result5 = if (nextNums4.size == 1) {
            Pair(nextNums4[0], 0)
        } else if (nextNums4.isEmpty()) {
            null
        } else {
            getLargestNum(nextNums4, result4?.second?.minus(1))
        }

        if (result5 == null) {
            val nextResultStr = result5?.first?:""
            return result1?.first.toString() +
                    result2?.first.toString() +
                    result3?.first.toString() +
                    result4?.first.toString() +
                    nextResultStr
        }

        val nextNums5 = remove(nextNums4, result5?.second?:0)
        val result6 = if (nextNums5.size == 1) {
            Pair(nextNums5[0], 0)
        } else if (nextNums5.isEmpty()) {
            null
        } else {
            getLargestNum(nextNums5, result5?.second?.minus(1))
        }

        if (result6 == null) {
            val nextResultStr = result6?.first?:""
            return result1?.first.toString() +
                    result2?.first.toString() +
                    result3?.first.toString() +
                    result4?.first.toString() +
                    result5?.first.toString() +
                    nextResultStr
        }
        return "0" // TODO: 마무리 해야 됨
    }

    private fun getLength(nums: IntArray) = nums.joinToString("").length

    private fun remove(arr: IntArray, index: Int): IntArray {
        if (index < 0 || index >= arr.size) {
            return arr
        }

        val result = arr.toMutableList()
        result.removeAt(index)
        return result.toIntArray()
    }

    private fun getLargestNum(nums: IntArray, index: Int?): Pair<Int, Int>? {
        if (index == null|| index < 0) {
            return null
        }
        val lastIdx = nums.lastIndex - index
        val firstNum = nums[index]
        val lastNum = nums[lastIdx]

        val numberLength = getLength(nums)
        val firstResult = appendZeros(firstNum, numberLength)
        val lastResult = appendZeros(lastNum, numberLength)

        return if (firstResult > lastResult) {
            Pair(firstNum, index)
        } else {
            Pair(lastNum, lastIdx)
        }
    }

    private fun appendZeros(firstNum: Int, numberLength: Int): Long {
        val firstNumLength = firstNum.toString().length
        val zeros = getZeros(numberLength, firstNumLength)

        return (firstNum.toString() + zeros).toLong()
    }

    private fun getZeros(numberLength: Int, firstNumLength: Int): String {
        val sb = StringBuffer()
        for (i in 0 until (numberLength - firstNumLength)) {
            sb.append("0")
        }
        return sb.toString()
    }
}