package com.example.androidpractice.Kotlin

// 08. 제어 흐름
// 코드의 흐름을 제어하는 것

// if, else 문


fun main(array: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if, else 문 사용하는 방법
    if (a > b) {
        println("a is bigger than b")
    } else {
        println("a is smaller than b")
    }
    // if, else, else if(원하는 만큼) 사용하는 방법
    if (a > b) {
        println("1")
    } else if (a < b) {
        println("2")
    } else {
        println("3")
    }

    // 값을 리턴하는 if 사용방법, 리턴 키워드 사용 안해도 된다
    val max = if (a > b) {
        a
    } else {
        b
    } // if(a > b) a else b 이렇게 해도 된다 java에선 불가능
    println(max)
}