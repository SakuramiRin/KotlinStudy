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
@date 2019-08-27 21:39
 */

// 抽象类是事物的本质，接口是事物的能力
// 抽象类有状态，接口没有状态
// 抽象类有方法实现，接口只有无状态的默认实现

// 基本接口
interface InputDevice {
    // 需要实现的方法
    fun input(event: Any) {
        println("默认实现方法 $event")
    }
}

// 两个实现基本接口的接口
interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

abstract class USBMouse(private val name: String) : USBInputDevice, OpticalMouse {
    override fun input(event: Any) {
        println("抽象类实现方法 $event")
    }

    override fun toString(): String {
        return name
    }
}

interface OpticalMouse {

}

class LogitechMouse : USBMouse("罗技鼠标A") {

}

class Computer {
    private fun addUSBInputDevice(inputDevice: USBInputDevice) {
        println("add input device: $inputDevice")
    }

    private fun addBLEDevice(inputDevice: BLEInputDevice) {
        println("add input device: $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is BLEInputDevice -> addBLEDevice(inputDevice)
            is USBInputDevice -> addUSBInputDevice(inputDevice)
            else -> throw IllegalArgumentException("输入的设备不支持")
        }
    }
}

fun main() {
    val computer = Computer()
    val mouse = LogitechMouse()
    computer.addInputDevice(mouse)
}


//===================================
// kotlin中抽象类和接口的不同

abstract class AbstractClass {
    var i = 0

    // 可被复写，不是必须
    open fun function() {
        println(i)
    }

    abstract fun function2()

}

interface Interface {
    //接口内不能初始化成员变量,相当于有了隐藏的set get方法
    var j: Int

    //    fun function () {
//        println("这是默认实现 $j,去掉括号就是必须实现的方法")
//    }
    fun function()
}

class AbstractAndInterface(override var j: Int) : Interface {
    override fun function() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class AbstractAndInterface2 : AbstractClass() {
    override fun function2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun function() {
        super.function()
    }
}