package oop

 class House( val height: Double,  val color: String,  var price: Int = 50000){
    fun print(){
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main(args: Array<String>){
    val house = House(20.0, "Red", 20000)

    val house2= House(height = 18.0, color = "White", price = 30000)

    val blueHouse = House(color = "Blue", price = 2999, height = 12.0)
    val yellowHouse = House(color = "Blue", height = 18.0)

    house.print()
    house2.print()
    blueHouse.print()
    yellowHouse.print()

    yellowHouse.price = 50
    yellowHouse.print()
}

