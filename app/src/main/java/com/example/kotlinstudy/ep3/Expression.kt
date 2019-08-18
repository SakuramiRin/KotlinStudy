/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.kotlinstudy.ep3

/**
@author SakuramiRin
@date 2019-08-18 13:10
 */

// 在Kotlin 中 if 是分支表达式！！！！！
// 也就是说if是有返回值的，返回的是最后一句
// 而不是java中的分支语句

private const val USER_NAME = "kotlin"
private const val PASSWORD = "me"

fun main(args: Array<String>) {

    // 如果mode只赋值过一次后就再也没有改变过了的话
    val mode: Int
    if (true) {
        mode = 1
    } else {
        mode = 0
    }

    val mode1 = if (true) 1 else 0

    println("请输入用户名")
    val username = readLine()
    println("请输入密码")
    val password = readLine()

    if (username == USER_NAME && password == PASSWORD) {
        println("成功")
    } else {
        println("失败")
    }

    val result = when ("什么都行") {
        "什么都行" -> true
        else -> false
    }

    循环标识符@ for ((index, value) in args.withIndex()) {
        println("$index + $value  in 前面括号括起来的是withIndex函数的返回类型Iterable中【Data类】IndexedValue的两个属性")
        if (index == 2) {
            // 跳过本次
            continue
        }

        if (value == "100") {
            // 跳出循环，可指定
            break@循环标识符
        }
    }

    // 具名参数写法
    function(parameter2 = 2, parameter1 = 1)
}

fun function(parameter1: Int = 0, parameter2: Int) = parameter1 + parameter2

// 变长参数，只能是最后一个，不然需要结合具名参数，同时变长参数可以出入当前对象的数组array，但需要在前面添加【*】！！！！！！！！！！！！！！
fun varargFunction(vararg ints: Int) {
    ints.forEach {
        println(it)
    }
}