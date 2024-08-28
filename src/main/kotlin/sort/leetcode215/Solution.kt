package sort.leetcode215

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val tempNums = nums.toMutableList()

        var leftIndex = 0
        var rightIndex = tempNums.lastIndex - 1

        val (pivot, pivotIndex) = getPivotElement(tempNums, leftIndex)
        val lastIndexNum = tempNums[tempNums.lastIndex]
        tempNums[pivotIndex] = lastIndexNum
        tempNums[tempNums.lastIndex] = pivot

        return getQuickSelectedArr(tempNums, leftIndex, rightIndex, pivot, k)
    }

    fun getQuickSelectedArr(
        tempNums: MutableList<Int>,
        leftIndex: Int,
        rightIndex: Int,
        pivot: Int,
        k: Int
    ): Int {
        if (rightIndex - leftIndex <= 1) {
            return tempNums[tempNums.size - k]
        }

        var lidx = leftIndex
        var ridx = rightIndex

        while (true) {
            var isLeftStopped = false
            var isRightStopped = false

            val leftNum = tempNums[lidx]
            if (leftNum < pivot) {
                lidx += 1
            } else {
                isLeftStopped = true
            }

            val rightNum = tempNums[ridx]
            if (rightNum > pivot) {
                ridx -= 1
            } else {
                isRightStopped = true
            }

            if (lidx >= ridx) {
                val currentRightNum = tempNums[ridx]
                tempNums[ridx] = pivot
                tempNums[tempNums.lastIndex] = currentRightNum
                break
            }

            if (isLeftStopped && isRightStopped) {
                tempNums[lidx] = rightNum
                tempNums[ridx] = leftNum
            }
        }

        val (newPivot, newPivotIndex) = getPivotElement(tempNums, ridx)
        val lastIndexNum = tempNums[tempNums.lastIndex]
        tempNums[newPivotIndex] = lastIndexNum
        tempNums[tempNums.lastIndex] = newPivot

        return getQuickSelectedArr(tempNums, ridx, tempNums.lastIndex - 1, newPivot, k)
    }

    fun getPivotElement(arr: MutableList<Int>, leftIndex: Int): Pair<Int, Int> {
        val index = (leftIndex + arr.lastIndex) / 2
        return arr[index] to index
    }
}