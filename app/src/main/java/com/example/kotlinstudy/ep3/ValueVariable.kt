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
@date 2019-08-17 23:47
 */

val value = "kotlin final 定值"
//var variable = "可变的"

const val value1 = "final 定值"

/*
* val 与Java final类型
* 区别在于 Java中的final 是编译期常量，在编译的时候，就已经知道这个值了
* 而Kotlin的val是运行时常量，也就是在编译的时候，仍然不知道这个值
* 当有const关键词修饰的时候，const val 才真正和java中的final完全等价
*
* 可从ByteCode中获得验证
*
* 这是value有的而value1没有的
*     LINENUMBER 16 L0
*   GETSTATIC com/example/kotlinstudy/ep3/SmartClassDerivationKt.value : Ljava/lang/String;
*    ARETURN
*
*
* */