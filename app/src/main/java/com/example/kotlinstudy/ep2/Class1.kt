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
@date 2019-08-17 17:24
 */

class Class1 constructor(parameter1: String, parameter2: String, parameter3: String) :
    FatherClass(parameter1, parameter2, parameter3) {
    //constructor() 可省略

    init {
        println("Class1构造方法的方法体")
    }
}

class Class2 constructor(var parameter1: String, var parameter2: String, var parameter3: String) {
    //constructor() 可省略

    init {
        println("Class2构造方法的方法体")
    }
}

// Any()为终极类
open class FatherClass(var parameter1: String, var parameter2: String, var parameter3: String): Any() {
    init {
        println("new 了一个${this.javaClass.simpleName}打印出来当前的对象，$parameter1, $parameter2, $parameter3")
    }
}


fun main() {
    val aClass1: Class1 = Class1("", "", "")
    val aClass2: Class2 = Class2("", "", "")
}
