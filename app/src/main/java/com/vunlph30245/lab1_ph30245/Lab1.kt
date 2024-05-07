package com.vunlph30245.lab1_ph30245

fun main(){
    println("Hello Kotlin")
    println("------------")

    //Khai bao su dung bien
    val a = 1
    val b = 2
    var c = a +b
    val  mess : String = "Tong 2 so $a va $b la : $c"

    println(mess)

    val soA = 1
    val soB = 3f
    val kq = phepChia(soA, soB)
    println(kq)

    //khai bao va su dung mang
    val arrX = intArrayOf(1,2,3,4)
    val  arrY = arrayOf(1.5f, "A", 1)

    println("""Gia tri dau tien mang X:" + ${arrX[0]}
        | Gia tri dau tien mang Y: ${arrY[0]}
    """.trimMargin())
}

fun phepChia(soA : Int, soB : Float) : String{
    if(soB == 0f){
        return "soB khong duoc = 0"
    }

    val thuong = soA / soB

    return "Thuong 2 so $soA va $soB = $thuong"
}

class Lab1 {
}