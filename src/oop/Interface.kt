package oop

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build(){
        println("Building something...")
    }
}

class Car(val color: Color) : Driveable, Buildable {
    override val timeRequired: Int = 120

    override fun drive() {
        println("Driving car...")
    }

    override fun build() {
        println("Build shiny car...")
    }
}

class MotorCycle(val color: Color) : Driveable {
    override fun drive() {
        println("Driving motorcycle...")
    }
}

fun main(args : Array<String>){

    // best solution for color is create object class of color or enum class
    val car = Car(Color.BLUE)
    println(car.color)
    car.drive()

    val motorCycle : Driveable = MotorCycle(Color.RED)
    motorCycle.drive()
}