package com.example.androidpractice.Kotlin

// 01. Variable
// -> 변수는 상자라고 생각

// 변수를 선언하는 방법
// var/val 변수명(상자) = 값(넣고 싶은 것)
// variable(원하는 것을 넣을 수 있는 상자)/value(불변의 값을 넣는 상자)

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 4.5

    println(num)
    println(hello)
    println(point)

    // val 은 변경 불가능하다.

}