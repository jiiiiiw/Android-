package com.example.androidpractice.Kotlin

// 02. 자료형
// 정수형 : Long > Int > Short > Byte
// 실수형 : Double > Float
// 문자 : Char
// 문자열 : String
// 논리형(True/False) : Boolean

var number = 10


// 변수 선언하는 방법(2)
// var/val 변수 : 자료형 = 값

var number1: Int = 20
var hello1: String = "Hello"
var point1: Double = 3.4
// 되도록이면 자료형까지 첨언하자

fun main(array: Array<String>){
    number = 20
    // number에는 정수형인 값만 지정할 수 있다 number = 20.5 같은 경우는 불가

}

// Variable or Value??
// 1. 변하지 않는 값이라면 val
// 2. 값의 변함이 모호하다 val -> 나중에 생겼을때에 var로 변환하는것이 편리리
