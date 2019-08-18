/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.kotlinstudy.ep2

import android.util.Range

/**
@author SakuramiRin
@date 2019-08-17 22:14
 */

val range: IntRange = 0..1024 // 闭区间 0到1024
val anotherRange: IntRange = 0 until 1024 // 0到1024的半开区间 [0,1024) 等价于 0..1023

val emptyRange: IntRange = 0..-1

/*
* ClosedRange接口有4个基本实现类
* IntRange LongRange CharRange ComparableRange
* 并且 方法contains() 前面有 operator 关键字修饰 等价于【in】
* */

fun main() {
    // Range接口的两个基本方法 empty() 和 contains
    println(emptyRange.isEmpty())
    println(range.contains(50))
    //包含等价于
    println(5 in anotherRange)

    // in 还可以用于迭代
    for (i in range) {
        println("$i")
    }
}
