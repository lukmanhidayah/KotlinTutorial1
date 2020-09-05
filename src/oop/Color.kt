package oop

enum class Color(val rgb: Int) {
    RED(0xFF000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main(args: Array<String>) {
    // 0..9 -> 10
    //0..9,A,B,C,D,E,F -> 0x10  (HEXADECIMAL NUMBER)
    println(0x10) //16
    println(0x1F) //31
    println(0xFF) //255

    println("----------------")
    println(0x000000) // BLACK
    println(0xFFFFFF) // WHITE
    println(0xFF0000) // RED
    println(0x00FF00) // GREEN
    println(0x0000FF) // BLUE
    println(0x000088) // DARK BLUE

    //binary number
    //terms of using binary is early write 0b before binary number
    //0..1 ->0b1010 = 10
    println("----------------")
    println(0b1010)
    println(0b101)
    println(0b00001010)
    println(0b11111111 == 0xFF) // =255
    println(0b11111111_00000000_00000000 == 0xFF0000)


    // 1 and 1 = 1
    // 1 and 0 = 0
    // 0 and 1 = 0
    // 0 and 0 = 0
    println("----------------")
    println(1 and 1 == 1)
    println(0b1101 and 0b1011)

    println("----------------")
    //0x01CAFE and 0xFF0000 == 0x010000
    println(Color.RED.containRed())
    println(Color.BLUE.containRed())
    println(Color.GREEN.containRed())
    println(Color.YELLOW.containRed())

    println("----------------")
    println("OR OPERATOR")
    //bitwise operator except and
    //or operator
    // 1 and 1 = 1
    // 1 and 0 = 1
    // 0 and 1 = 1
    // 0 and 0 = 0
    println("0b1101 or 0b1000 = " + 0b1101) // result is 0b1101 = 13
    println("XOR OPERATOR")
    //xor operator
    // 1 and 1 = 0
    // 1 and 0 = 1
    // 0 and 1 = 1
    // 0 and 0 = 0
    println("0b1101 xor 0b1000 = " + 0b0101) // result is 0b0101 = 5

    println("Inverse Binary")
    //inverse binary
    println(0b10011) //result is 0b01100
    println(0b10011.inv() and 0x0000001F)
}