package com.vunlph30245.lab1_ph30245

//eg1

//fun main() {
//    cases("Hello")
//    cases(1)
//    cases(0L)
//    cases(BaiLamThem())
//    cases("hello")
//}
//
//fun cases(obj: Any) {
//    when (obj) {
//        1 -> println("One")
//        "Hello" -> println("Greeting")
//        is Long -> println("Long")
//        !is String -> println("Not a string")
//        else -> println("Unknown")
//    }
//}

//eg2
//fun main() {
//    println(whenAssign("Hello"))
//    println(whenAssign(3.4))
//    println(whenAssign(1))
//    println(whenAssign(BaiLamThem()))
//}
//
//fun whenAssign(obj: Any): Any {
//    val result = when (obj) {
//        1 -> "one"
//        "Hello" -> 1
//        is Long -> false
//        else -> 42
//    }
//    return result
//}

//eg3: Loops (vong lap)
//fun main(args: Array<String>) {
//    val cakes = listOf("carrot", "cheese", "chocolate")
//
//    for (cake in cakes) {
//        println("Yummy, it's a $cake cake!")
//    }
//
//}

//eg4:

//fun eatACake() = println("Eat a Cake")
//fun bakeACake() = println("Bake a Cake")
//
//fun main(args: Array<String>) {
//    var cakesEaten = 0
//    var cakesBaked = 0
//
//    while (cakesEaten < 5) {                    // 1
//        eatACake()
//        cakesEaten ++
//    }
//
//    do {                                        // 2
//        bakeACake()
//        cakesBaked++
//    } while (cakesBaked < cakesEaten)
//
//}

//eg5:
//class Animal(val name: String)
//
//class Zoo(val animals: List<Animal>) {
//
//    operator fun iterator(): Iterator<Animal> {             // 1
//        return animals.iterator()                           // 2
//    }
//}
//
//fun main() {
//
//    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
//
//    for (animal in zoo) {                                   // 3
//        println("Watch out, it's a ${animal.name}")
//    }
//
//}

//eg6:

//fun main() {
//    for(i in 0..3) {             // 1
//        print(i)
//    }
//    println(" ")
//
//    for(i in 0 until 3) {        // 2
//        print(i)
//    }
//    println(" ")
//
//    for(i in 2..8 step 2) {      // 3
//        print(i)
//    }
//    println(" ")
//
//    for (i in 3 downTo 0) {      // 4
//        print(i)
//    }
//    println(" ")
//    println("---------------")
//
////
//    for (c in 'a'..'d') {        // 1
//        print(c)
//    }
//    println(" ")
//
//    for (c in 'z' downTo 's' step 2) { // 2
//        print(c)
//    }
//    println(" ")
//    println("---------------")
//
////
//
//    val x = 2
//    if (x in 1..5) {            // 1
//        print("x is in range from 1 to 5")
//    }
//    println()
//
//    if (x !in 6..10) {          // 2
//        print("x is not in range from 6 to 10")
//    }
//}


//eg7:

//fun main() {
//
//    val authors = setOf("Shakespeare", "Hemingway", "Twain")
//    val writers = setOf("Twain", "Shakespeare", "Hemingway")
//
//    println(authors == writers)   // 1
//    println(authors === writers)  // 2
//}

//eg8

fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
}

class BaiLamThem(){

}