package timo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    var counter = 1
    var counterCo = 1
    var ms = measureTimeMillis {
        for(n in 1..100000){

            thread{
                counter++
            }
        }

    }
    var ms2 = measureTimeMillis { {

     for(i in 1..100000){
         GlobalScope.launch {
             counterCo++
         }

     }
    } }

    println("$ms    $counter")
    println("$ms2   $counterCo")

  /*
    Thread({
        for(i in 1..10){

            println("Thread :${i}")
            Thread.sleep(50)
        }

    }).start()

    thread {
        for(i in 1..10){

            println("thread()  $i")
        }
    }

GlobalScope.launch {
    for(i in 1..10){

        println("coroutines: $i")
        delay(50L)
    }

}

*/

}