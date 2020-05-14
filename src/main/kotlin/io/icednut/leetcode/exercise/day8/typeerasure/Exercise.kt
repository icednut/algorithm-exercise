package io.icednut.leetcode.exercise.day8.typeerasure

/**
 * @author will.109
 * @date 2020/05/12
 **/
fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}
