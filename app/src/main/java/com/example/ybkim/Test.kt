package com.example.ybkim

import android.util.Log



fun main(array:Array<String>) {
//
//     var n1 : Int = 10
//    var n2 : Int? = 20
//
//    var n3 = n2 ?: 10
//
//    println ( n3 )
//
//
//    lateinit var latecar : Car
//
//
//    latecar = Car(10, 100)
//    println("latecar:" + latecar.num2)

    var n1 : Int? = null

    var n2 = n1!! + 10

    println ( n2 )


}

class Car(var num: Int, var num2: Int) {
}