package greedy.leetcode1710

class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        val sortedBoxes = sort(boxTypes)
        var leftTruckSize = truckSize
        var result = 0

        for (box in sortedBoxes) {
            if (leftTruckSize <= 0) {
                break
            }

            val count = box[0]
            val units = box[1]

            if (leftTruckSize > count) {
                leftTruckSize -= count
                result += units * count
            } else {
                val currentSize = leftTruckSize
                leftTruckSize -= currentSize
                result += units * currentSize
            }
        }

        return result
    }

    private fun sort(boxes: Array<IntArray>): Array<out IntArray> {
        return boxes.sortedWith(
            compareByDescending { it[1] }
        ).toTypedArray()
    }
}