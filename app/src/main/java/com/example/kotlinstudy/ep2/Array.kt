/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.kotlinstudy.ep2

/**
@author SakuramiRin
@date 2019-08-17 22:40
 */

val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("我", "是", "字符串数组")
val arrayOfClass: Array<Any> = arrayOf(Child(), Parent())

fun main() {
    // array 的基本方法 get set size iterator
    println(arrayOfInt.size)

    // 迭代
    for (string in arrayOfString) {
        println(string)
    }
    //==========================
    // 迭代更简便的写法，和上面完全等价
    arrayOfString.forEach {
        println(it)
    }

    //作为形参的it是可以变的

    arrayOfString.forEach { elemt -> println(elemt) }
    //public inline fun <T> Array<out T>.forEach(action: (T) -> Unit): Unit {
    //    for (element in this) action(element)
    //}
    //这是扩展方法forEach的源码
    //==========================

    // get set 可以用arrayOf**[]

    println(arrayOfString[1])

    arrayOfString[1] = "真的是"

    for (string in arrayOfString) {
        println(string)
    }

    // 连接字符串 可以进joinToString方法里面看更多有趣的设置 ，当前的设置是分隔符
    println(arrayOfChar.joinToString(""))

    // 字符串切割
    println(arrayOfInt.slice(1..2))

}
