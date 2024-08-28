package backtracking.leetcode46

class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val output = mutableListOf<List<Int>>()

        fun go(index: Int, middleResult: MutableList<Int>) {
            if (index == nums.size) {
                output.add(middleResult.toList())
                return
            }

            val num = nums[index]

            for (i in nums) {
                if (!middleResult.contains(i)) {
                    middleResult.add(i)
                    go(index + 1, middleResult)
                    middleResult.removeLast()
                }
            }
        }

        go(0, mutableListOf<Int>())
        return output
    }
}