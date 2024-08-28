package io.icednut.algorithm.exercise.sort.leetcode215

class Solution2 {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        fun swap(numList: MutableList<Int>, first: Int, next: Int) {
            val temp = numList[first]
            numList[first] = numList[next]
            numList[next] = temp
        }

        fun partition(numList: MutableList<Int>, leftIndex: Int, rightIndex: Int): Int {
            if (leftIndex == rightIndex) {
                return leftIndex
            }
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

        fun quickSelection(numList: MutableList<Int>, leftIndex: Int, rightIndex: Int, k: Int): Int {
            var st = partition(numList, leftIndex, rightIndex)

            if (st == k && leftIndex == rightIndex) {
                return numList[k]
            } else if (st > k) {
                return quickSelection(numList, leftIndex, st - 1, k)
            } else {
                return quickSelection(numList, st, rightIndex, k)
            }
        }

        val numList = nums.toMutableList()
        return quickSelection(numList, 0, numList.lastIndex, numList.lastIndex - (k - 1))
    }
}