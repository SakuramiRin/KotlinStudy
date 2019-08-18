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
@date 2019-08-18 0:18
 */

fun main(args: Array<String>): Unit {

    // 锤子旁边的运行配置中 Program arguments 就是设置main 函数args的地方，不设置的话为null，args[0]会报错
    println("hello ${args[0]}")

    println(int2Long(3))

    // 程序不会crash，会打印Function1<java.lang.Integer, java.lang.Long>
    println(int2Long)
}

/*
fun 函数名(参数1: String, 参数2: String): Unit {
    println("函数体")
}
*/
fun sum(args1: Int, args2: Int): Int {
    return  args1 + args2
}

/*fun 函数(参数1: String, 参数2: String) = println("表达式")*/
fun sum1(args1: Int, args2: Int) = args1 + args2

//函数是可以没有名字的,直接赋值给val变量，这就叫
//匿名函数
val int2Long = fun(x: Int):Long{
    return x.toLong()
}