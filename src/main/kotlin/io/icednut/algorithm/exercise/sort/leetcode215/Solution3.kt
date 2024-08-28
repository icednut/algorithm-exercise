package io.icednut.algorithm.exercise.sort.leetcode215

class Solution3 {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        val numList = nums.toMutableList()
        return quickSelect(numList, 0, numList.lastIndex, nums.size - k)
    }

    private fun quickSelect(numList: MutableList<Int>, leftIndex: Int, rightIndex: Int, k: Int): Int {
        val st = partitioning(numList, leftIndex, rightIndex)

        if (st == k) {
            return numList[k]
        } else if (st > k) {
            return quickSelect(numList, leftIndex, st - 1, k)
        } else {
            return quickSelect(numList, st, rightIndex, k)
        }
    }

    private fun partitioning(numList: MutableList<Int>, leftIndex: Int, rightIndex: Int): Int {
        val pivotIndex = leftIndex
        val pivot = numList[pivotIndex]
        var st = leftIndex + 1

        for (i in st..rightIndex) {
            if (pivot > numList[i]) {
                swap(numList, st, i)
                st++
            }
        }

        swap(numList, pivotIndex, st - 1)
        return st
    }

    private fun swap(numList: MutableList<Int>, a: Int, b: Int) {
        val temp = numList[a]
        numList[a] = numList[b]
        numList[b] = temp
    }
}