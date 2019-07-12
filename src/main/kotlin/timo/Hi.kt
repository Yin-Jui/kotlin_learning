package timo

import java.util.*

fun main(args: Array<String>) {

    var str: String? = p()

    str = null;
    println("hi")
    val pe = Pe("koko")

    pe.hell()

    val scanner = Scanner(System.`in`)

    var name = scanner.next()

    var score = scanner.nextInt()
    println(name + "  " + score)
}

fun p(): String? {
    var str: String? = "saaass"

    println(str?.get(3))
    return str
}




class Pe(var name: String) {

    fun hell() {
        println(name)
    }

}