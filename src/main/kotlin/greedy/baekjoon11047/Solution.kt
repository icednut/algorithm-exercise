package greedy.baekjoon11047

import java.util.Scanner

class Solution {

    fun findCoinCount(coinCount: Int, price: Int, coins: List<Int>): Int {
        var currentPrice = price
        var result = 0

        for (coin in coins.reversed()) {
            if (currentPrice < coin) {
                continue
            }

            val rest = currentPrice % coin
            val currentCoinCount = currentPrice / coin

            currentPrice = rest
            result += currentCoinCount
        }

        return result
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val coinCount = scanner.nextInt()
    val price = scanner.nextInt()
    val coins = IntArray(coinCount).map {
        scanner.nextInt()
    }

    val solution = Solution()

    val count = solution.findCoinCount(coinCount, price, coins)
    println(count)
}