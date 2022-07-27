package com.example.androidpractice.Kotlin

fun plusThree(first: Int, second: Int, thrid: Int): Int {
    val result = first + second + thrid
    return result
}

fun minusThree(first: Int, second: Int, thrid: Int) = first - second - thrid

fun multiplyThree(first: Int = 1, second: Int = 1, thrid: Int = 1): Int {
    return first * second * thrid
}

// 내부함수
// 함수 안에 함수 있다
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(fist: Int, second: Int): Int {
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>) {
    val result = plusThree(1, 2, 3)
    println(result)
    val result2 = minusThree(10, 2, 1)
    println(result2)
    val result3 = multiplyThree(5, 6, 7)
    println(result3)
    val result4 = multiplyThree()
    println(result4)
    println()

    showMyPlus(5, 6)
}