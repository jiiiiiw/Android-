package com.example.androidpractice.Kotlin

var a = 1+2+3+4+5 // 연산의 결과값을 변수에 넣을 수 있다
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e. Nice to meet you"

// Null
// 존재 하지 않는다, 자료형에 ?를 붙여줘야 한다
// var test1: Int = null Null can not be a value of a non-null type
var abc: Int? = null

var g = a + 3 // 이런식으로 변수를 포함한 수식을 또다른 변수에 저장할 수도 있다

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc)
}