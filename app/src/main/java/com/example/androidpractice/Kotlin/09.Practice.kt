package com.example.androidpractice.Kotlin

fun main(array: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("Correct")
    } else {
        println("Wrong")
    }

    // 엘비스 연산자 : Kotlin 언어의 특징 -> Null Safety
    val number: Int? = null
    val number2 = number ?: 10 // ?: 앞 변수가 null일시에 10을 넣어라

    println(number2)

    // 리턴값을 리턴하는 if문은 예외처리를 완벽히 해주어야 한다, else를 처리해주자
    val num1: Int = 20
    val num2: Int = 20

    val max: Int = if(num1 > num2){
        num1
    }else if(num1 == num2){
        num1 + num2
    }else{
        num2
    }

    println(max)
}