/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.kotlinstudy.ep2

import com.example.kotlinstudy.ep2.Class1 as ABC

/**
@author SakuramiRin
@date 2019-08-17 17:52
 */

class Child() : Parent() {
    fun methodChild() {
        println("子类特有方法")
    }
}

open class Parent() {
    fun methodParent() {
        println("父类方法")
    }
}


fun main() {
    val instance: Parent = Child()

    if (instance is Child) {
        instance.methodChild()
    }

    val parent: Parent = Parent()
    val child2: Child? = parent as? Child //不会出现类型转换异常 安全类型转换
//    val child1: Child = parent as Child
//    此时和java一样，会抛出类型转换异常

    // import as 别名用法
    val class1: ABC = ABC("", "", "")

}