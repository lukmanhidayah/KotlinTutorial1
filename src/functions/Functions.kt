package functions

import java.util.*

// function with no parameter and no return
fun helloWorld() {
    println("Hello world")
}

//function with parameter, no return
fun printWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
}

//specify return type, must have return but can't have parameter
fun getCurrentDate(): Date {
    return Date()
}

//specify return type, must have return and have parameter
fun max(a: Int, b: Int): Int{
    return if(a >= b)
        a
    else
        b
}

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin is easy to use")
    println(getCurrentDate())
    println(max(5,2))
}