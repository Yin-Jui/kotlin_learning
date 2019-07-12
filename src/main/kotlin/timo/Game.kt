package timo

import java.util.*
import kotlin.collections.RandomAccess

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val secret = Random().nextInt(10) + 1
    println("Enter a number")
    var number = 0

    while (number != secret) {
        number = scanner.nextInt()
        if (number > secret) println("lower")
        else if (number < secret) println("higher")
        else println("bingo  : $secret")
    }
}