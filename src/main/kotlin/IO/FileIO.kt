package IO

import java.io.File

fun main(args: Array<String>) {

File("data.txt").bufferedReader().lines().forEach(){

    println(it)
    write()
}


}
    fun write(){

        //    File("output.txt").writeText("osda")
        File("output.txt").bufferedWriter().use {
            it.write("wpeqed\n")
            it.write("daxxxx\n")
    }
}