/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.kotlinstudy.ep4

/**
@author SakuramiRin
@date 2019-08-27 22:26
 */

//
class Manager : Driver, Writer {
    override fun writer() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun driver() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

// 接口代理 by
class SeniorManager(val driver: Driver, val writer: Writer) : Driver by driver,
    Writer by writer {
}

class CarDriver : Driver {
    override fun driver() {
        println("我在开车呢")
    }
}

class PPTWriter : Writer {
    override fun writer() {
        println("我在做ppt呢")
    }
}


interface Driver {
    fun driver()
}

interface Writer {
    fun writer()
}

fun main() {
    val driverA = CarDriver()
    val writerA = PPTWriter()
    val seniorManager = SeniorManager(driverA, writerA)
    seniorManager.driver()
    seniorManager.writer()


}