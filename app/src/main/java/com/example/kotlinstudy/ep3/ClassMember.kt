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
@date 2019-08-18 2:50
 */

class ClassMember(val s: String) {

    // 属性 和 方法

    // 函数和方法的区别
    // 函数强调功能本身，不考虑从属问题，也就是可以定义在class外面
    // 方法的称呼通常是从类的角度出发的

    // 属性的初始化尽量在构造方法中完成，如果不行，用下面的延迟手段
    var parameter = 0
        get() {
            println("Kotlin对于成员变量都有系统自动的 get set 方法,field指代参数后面实际的值且只能在get, set中访问到")
            return field + 1
        }
        set(value) {
            println("set方法")
            field = value + 1
        }

    // var c: String 直接这么写是不行的，需要延迟初始化 lateinit
    lateinit var varString: String

    // 而val是不能延迟初始化的，对于val的延迟初始化是这样的
    val valString: String by lazy {
        println("init了val")
        "lazy形式的初始化"
    }
}

fun main() {
    ClassMember("").parameter = 2
    println("${ClassMember("").parameter} 此时输出还是1")

    val classMember = ClassMember("类的括号里面也可以定义属性它和没有val的构造参数是不同的,")
    classMember.parameter = 2
    println("${classMember.parameter} 此时输出为4,2set的时候加了1，get的时候再加了1")

    println("${classMember.s} 在类小括号里面的没有val的构造参数是不能被这么调用的")


}