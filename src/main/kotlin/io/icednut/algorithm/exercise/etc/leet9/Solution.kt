package io.icednut.algorithm.exercise.etc.leet9

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val strX = x.toString()
        val reversedX = strX.reversed()

        return strX.equals(reversedX)
    }
}