package timo

import java.time.Duration
import java.time.LocalDateTime
import java.time.ZoneId

fun main(args: Array<String>) {

    val enter = LocalDateTime.of(2018,12,25,8,0,0)
    val leave = LocalDateTime.of(2018,12,25,10,0,0)

    var car2:Car = Car("test",enter)


    val parkinglot = HashMap<String,Car?>()

    var car: Car? = Car("oooooaa", enter)
    parkinglot.put(car!!.id,car)

    car = Car("qqqwddas",enter.plusMinutes((20)))

    parkinglot.put(car!!.id,car)

    car = parkinglot.get("oooooaa")
    car?.leave = leave

    println("${car?.id}  duration: ${car?.duration()}")

    car = parkinglot.get("qqqwddas")
    car?.leave = leave
    println("${car?.id}  duration: ${car?.duration()}")

    val superCar = superCar("aaaa",enter,"axxxxx")
    println(superCar.duration())


}
class superCar(id: String,enter: LocalDateTime,id2: String) : Car(id,enter){
    companion object{
        val p :Long= 90
    }

    override fun duration(): Long {

        return p
    }
}


open class Car(val id:String, val enter: LocalDateTime){
    companion object{
        @JvmStatic
        val p = 60
    }

    var leave: LocalDateTime? = null

    set(value) {

        if(enter.isBefore(value))
            field =value

    }
    open fun duration() = Duration.between(enter,leave).toMinutes()
}