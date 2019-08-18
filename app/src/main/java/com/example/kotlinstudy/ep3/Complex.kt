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
@date 2019-08-18 12:39
 */

class Complex(var real: Double, var imaginary: Double) {
    // 操作符重载

    // real 实部 imaginary 虚部 成员属性
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary)
    }

    // 不复写toString的时候，返回的是一个Complex对象引用
    override fun toString(): String {
        return "$real + ${imaginary}"
    }

    operator fun invoke(): Double {
        return Math.hypot(real, imaginary)
    }

    // 自定义 中缀表达式 实际就是运行你不需要用点号来调用方法 和操作符一样
    // 需要注意的是 参数只能有一个
    infix fun my(string: String): String {
        return "my$string"
    }
}

fun main() {
    val c1 = Complex(3.0, 4.0)
    val c2 = Complex(5.0, 6.0)

    // 点击加号跳转的是Plus方法
    println(c1 + c2) // 8.0 + 10.0

    println(c1 + 6) // 9.0 + 4.0

    println(c1())

    println(c1 my "中缀表达式") // 输出 my中缀表达式  实际上等同于 c1.my("中缀表达式")
}
