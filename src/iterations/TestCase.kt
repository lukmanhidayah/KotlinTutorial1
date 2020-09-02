package iterations

fun main(args: Array<String>) {
    /*
    * For this challenge, try to write a program that calculates
    * the sum of all numbers from 100 to 100,000 and prints out the result.
    */
    var value = 0
    for (i in 100..100000) {
        value += i
    }
    println(value)
}