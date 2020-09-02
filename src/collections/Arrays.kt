package collections

fun main(args: Array<String>) {
    //array
    val array = arrayOf("Texas", "Iowa", "California") // immutable
    val mixed = arrayOf("Kotlin", 17, 3.0, false);
    val numbers = intArrayOf(1, 2, 4, 6);

    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])

    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states

    println("states size is " + allStates.size) // array length in kotlin

    val empty: Boolean = numbers.isEmpty()

    if (states.contains("Kentucky")) {
        println("It contains Kentucky")
    } else {
        println("It doesn't")
    }
}