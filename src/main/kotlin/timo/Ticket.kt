package timo

import java.util.*


data class Ticket(val origin:Int, val destination:Int,val price:Int)

fun main(args: Array<String>) {

    var ticket = Ticket(20,50,60)

    val s = "andsa"
    println(s.validate())
    println((1..10).random())

}

fun String.validate() : Boolean{

    return this.length >=2

}

fun IntRange.random(): Int{

    val r = Random().nextInt(this.endInclusive-this.start)+this.start
    return  r
}

