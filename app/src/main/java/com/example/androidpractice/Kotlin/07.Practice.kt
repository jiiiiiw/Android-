package com.example.androidpractice.Kotlin

fun main(array: Array<String>) {
    // 산술연산자
    var a = 10 + 2
    val b = 10 - 1
    val c = 1 * 9
    val d = 108 / 5
    val e = 55 % 9

    println(a)

    // 대입연산자
    val f = 5

    // 복합대입연산자
    a += 10
    println(a)

    // 증감연산자
    a++
    println(a)

    // 비교연산자
    val g = a > b
    val h = a == b
    var i = !h // boolean 값들을 가진 값만 !를 할 수 있다
    println(g)
    println(h)

    // 논리연산자
    val j = h && i
    val k = h || i
    println(j)
    println(k)

}