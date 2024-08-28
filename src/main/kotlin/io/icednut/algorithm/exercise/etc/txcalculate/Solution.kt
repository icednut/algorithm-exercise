package io.icednut.algorithm.exercise.etc.txcalculate

class Solution {

    fun exec(arr: Array<String>): IntArray {
        val fistPriceSum = getFirstPriceSum(arr)
        val lastPriceSum = getLastPriceSum(arr)

        return intArrayOf(fistPriceSum, lastPriceSum)
    }

    private fun getTransactionList(arr: Array<String>): Array<io.icednut.algorithm.exercise.etc.txcalculate.Transaction> =
        arr
            .filter {
                val element = it.split(" ")
                element.size == 3
            }
            .map {
                val element = it.split(" ")

                return@map io.icednut.algorithm.exercise.etc.txcalculate.Transaction(
                    transactionType = element[0],
                    price = element[1].toInt(),
                    count = element[2].toInt(),
                    currentCount = element[2].toInt()
                )
            }.toTypedArray()

    private fun getFirstPriceSum(arr: Array<String>): Int {
        var result = 0
        val transactionList = getTransactionList(arr)

        for ((index: Int, transaction: io.icednut.algorithm.exercise.etc.txcalculate.Transaction) in transactionList.withIndex()) {
            if (transaction.transactionType == "S") {
                val priceSum = getPriceSum(
                    transactionList,
                    index - 1,
                    false,
                    transaction.count
                )
                result += priceSum
            }
        }
        return result
    }

    private fun getLastPriceSum(arr: Array<String>): Int {
        var result = 0
        val transactionList = getTransactionList(arr)

        for ((index: Int, transaction: io.icednut.algorithm.exercise.etc.txcalculate.Transaction) in transactionList.withIndex()) {
            if (transaction.transactionType.equals("S")) {
                val priceSum = getPriceSum(
                    transactionList,
                    index - 1,
                    true,
                    transaction.count
                )
                result += priceSum
            }
        }
        return result
    }

    private fun getPriceSum(
        targetTransactionList: Array<io.icednut.algorithm.exercise.etc.txcalculate.Transaction>,
        startIndex: Int,
        isReversed: Boolean,
        targetCount: Int
    ): Int {
        var currentCount = targetCount
        var resultPrice = 0
        val range = if (isReversed) startIndex downTo 0 else 0..startIndex

        for (index in range) {
            val transaction = targetTransactionList[index]
            if (transaction.transactionType == "P") {
                val price = transaction.price
//                val count = transaction.count

                if (currentCount > transaction.currentCount && currentCount > 0 && transaction.currentCount > 0) {
                    val calculateTarget = transaction.currentCount
                    val result = if (currentCount < transaction.currentCount) 0 else currentCount - transaction.currentCount

                    transaction.currentCount = if (currentCount < transaction.currentCount) transaction.currentCount - currentCount else 0
                    currentCount = result
                    resultPrice += price * calculateTarget
                } else if (currentCount <= transaction.currentCount && currentCount > 0 && transaction.currentCount > 0) {
                    val calculateTarget = currentCount

                    transaction.currentCount = if (currentCount < transaction.currentCount) transaction.currentCount - currentCount else transaction.currentCount - currentCount
                    currentCount =  if (currentCount < transaction.currentCount) 0 else currentCount - transaction.currentCount
                    resultPrice += price * calculateTarget
                } else {
                    resultPrice += 0
                }
            }
        }

        return resultPrice
    }
}

data class Transaction(
    val transactionType: String,
    val price: Int,
    val count: Int,
    var currentCount: Int
)