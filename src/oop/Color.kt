package oop

enum class Color(val rgb: Int){
   RED(0xFF000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

fun main(args: Array<String>) {
   // 0..9 -> 10
   //0..9,A,B,C,D,E,F -> 0x10  (HEXADECIMAL NUMBER)
   println(0x10) //16
   println(0x1F) //31
   println(0xFF) //255

   println(0x000000) // BLACK
   println(0xFFFFFF) // WHITE
   println(0xFF0000) // RED
   println(0x00FF00) // GREEN
   println(0x0000FF) // BLUE
   println(0x000088) // DARK BLUE
}