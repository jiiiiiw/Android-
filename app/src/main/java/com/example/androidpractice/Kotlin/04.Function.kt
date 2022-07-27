package com.example.androidpractice.Kotlin

// 04. Function
// 함수 : input을 넣어주면 output이 나오는 것

// 함수를 선언하는 방법
// fun 함수명 (변수명 : 타입, 변수명 : 타입 ...) : 반환형{
// 함수내용
// return 반환값
// }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기, 변수형 Unit을 이용한다(아무것도 리턴하지 않겠다는 변수형)
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

//간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법 vararg를 사용
fun plusMany (vararg numbers: Int){
    for(number in numbers){
        println(number) // numbers에 들어온 값들을 하나하나 출력
    }
}

fun main(array: Array<String>) { // Unit은 생략이 가능함
    val result = plus(5, 10)
    val result1 = plus(first = 100, second = 30) // 인수의 순서를 바꿔도 무관
    val result2 = plusFive(7, 3)

    println(result)
    println(result2)
    printPlus(10, 20)
    val result3 = plusShort(30, 30)
    plusShort(50, 50)
    println(result3)
    println()

    plusMany(1,2,3)
}