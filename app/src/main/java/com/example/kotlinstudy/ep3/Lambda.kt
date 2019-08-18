/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.kotlinstudy.ep3

import com.example.kotlinstudy.ep2.arrayOfInt


/**
@author SakuramiRin
@date 2019-08-18 1:52
 */

//Lambda表达式 其实就是 匿名函数！！！！！
// 写法
// {参数列表 -> 函数体}
// 用()进行调用 等价于 invoke()

/* arg1 + arg2 就是lambda返回值
 *参数和返回值之间用 ->来间隔
 * lambda返回的永远是最后一行的值
 */
val sum = { arg1: Int, arg2: Int -> arg1 + arg2 }

val printlnHello = {
    println("Hello")
}

fun printUsage(): Unit {
    println("这是printUsage")
}

fun main() {
    println(sum(1, 2))
    // 上面其实是省略了 invoke 的结果
    println(sum.invoke(1, 3))

    println("$sum 会打印出Function2，它表示sum这个函数也好，匿名函数也好（其实就是lambda表达式），接受了 2 个带完整类路径的参数并返回了 1 个返回值")
    println(::printlnHello) //会输出属性反射不可用
    println(::printUsage) //会输出方法反射不可用
    println(::printUsage is () -> Unit) //但这里是true正确的，代表的Function0！

    //==========================
    // 针对 i in *** 迭代更简便的写法
    arrayOfInt.forEach { println(it) }

    //作为形参的it是可以变的

    arrayOfInt.forEach { 形参 -> println(形参) }
    //public inline fun <T> Array<out T>.forEach(action: (T) -> Unit): Unit {
    //    for (element in this) action(element)
    //}
    //这是扩展方法forEach的源码


    // lambda表达式的简化 最复杂
    arrayOfInt.forEach({ println("函数参数调用时最后一个Lambda可以移出去") })

    arrayOfInt.forEach() { println("如果（）没有任何参数，在省略掉（）")}

    //再进行lambda简化
    // println 接受一个参数Any 而forEach需要接受一个参数action<T>,它是Any的子类
    //也就是说
    //:: 叫做聚名函数，代表引用
    arrayOfInt.forEach(::println)
    //==========================

    //任意位置return
    arrayOfInt.forEach ForEach@{
        if (it == 5) {
            // 如果需要return掉的是lambda表达式，我们就需要给lambda取别名
            return@ForEach
        }
        println(it)
    }

    println("用了别名return后可以执行到此,上面的表达式相当于 1,3,5,7去掉5")

    arrayOfInt.forEach {
        if (it == 5) {
            // 此时return掉的不是lambda表达式而是整个main函数
            return
        }
        println(it)
    }

    println("直接return是执行不到此处的,1,3后就返回")
}

