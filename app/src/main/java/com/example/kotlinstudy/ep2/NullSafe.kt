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
@date 2019-08-17 17:43
 */

fun getName(): String? {
    return null
}

fun getNonNullName(): String? {
    return "绝对非空的情况"
}

fun main() {
    val name2 = getName()
    println(name2?.length)

    val name3 = getNonNullName()
    println("${name3!!.length} !!.为断言非null")

    // 简化的if else
    val name = getName() ?: return
    println(name.length)

}
