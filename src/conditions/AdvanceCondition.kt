package conditions

fun main(args: Array<String>) {
    val x = 20;
    when(x){
        5-> println("x is 5")
        3 * 12 -> println("x is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there'")
        in 1..10 -> println("x between 1 and 10")
        in 11..20 -> println("x between 11 and 20")
        in 21..30 -> println("x between 31 and 40")
        !in 1..9 -> println("x not between 1 to 9")
    }
}