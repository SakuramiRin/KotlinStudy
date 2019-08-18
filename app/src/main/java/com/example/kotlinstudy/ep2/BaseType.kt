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
@date 2019-08-17 13:19
 */

// kotlin不再区分装箱与非装箱类型

val trueBoolean: Boolean = true
val falseBoolean: Boolean = false

val aInt: Int = 8
val a16Int: Int = 0xFF
val a2Int: Int = 0b00000011
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

val aLong: Long = 12368172534L
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3F
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = Float.MIN_VALUE
val theTureMinFloat: Float = -Float.MAX_VALUE
// 正无穷 和 负无穷 和 不是数字
val positiveInfinityFloat: Float = Float.POSITIVE_INFINITY
val negativeInfinityFloat: Float = Float.NEGATIVE_INFINITY
val nanFloat: Float = Float.NaN

val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double = Double.MAX_VALUE
val minDouble: Double = Double.MIN_VALUE
val theTureMinDouble: Double = -Double.MAX_VALUE
// 正无穷 和 负无穷 和 不是数字
val positiveInfinityDouble: Double = Double.POSITIVE_INFINITY
val negativeInfinityDouble: Double = Double.NEGATIVE_INFINITY
val nanDouble: Double = Double.NaN

val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

val aByte: Byte = 20
val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE

val aChar: Char = '0'
val bChar: Char = '字'
val cChar: Char = '\u000f'

/**
 * 转义字符
 *
 * \t \b \n \r \' \" \\ \$
 */

val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

val rawString: String = """
    这是
    原始字符串
"""

fun main() {
    println("$aInt, $a16Int, $a2Int, ${maxInt == 2147483647}, ${minInt == -2147483648}")

    println("$aLong, $maxLong, $minLong")

    println("$aFloat, $anotherFloat, $maxFloat, $minFloat, $theTureMinFloat")
    println("$positiveInfinityFloat, $negativeInfinityFloat, ${nanFloat == (0.0F / 0.0F)} 这是一个false")

    println("$aDouble, $anotherDouble, $maxDouble, $minDouble, $theTureMinDouble")
    println("$positiveInfinityDouble, $negativeInfinityDouble, ${nanDouble.equals((0.0F / 0.0F))} 这是一个false")

    println("$aShort, $maxShort, $minShort")
    println("$aByte, $maxByte, $minByte")

    println(string == fromChars + "true")
    println(string === fromChars + "false")
    println("$rawString 的长度length是 ${rawString.length}")
}


