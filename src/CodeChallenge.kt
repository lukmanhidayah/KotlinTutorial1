import kotlin.random.Random

fun main(args: Array<String>) {
    /*
    Make random integer between 1 to 50 and check that value
    if value on range between 1 to 10 print random value in range 1 to 10
    if value on range between 11 to 20 print random value in range 11 to 20
    if value on range between 21 to 30 print random value in range 21 to 30
    if value on range between 31 to 40 print random value in range 31 to 40
    and addition if value not between 1 to 40 print random is range above 40
    */

    println("------- Code Challenge 1 ----------")
    when (val random = Random.nextInt(50) + 1) {
        in 1..10 -> println("random is range of 1 to 10, value is $random")
        in 11..20 -> println("random is range of 11 to 20, value is $random")
        in 21..30 -> println("random is range of 21 to 30, value is $random")
        in 31..41 -> println("random is range of 31 to 40, value is $random")
        else -> println("random is range above 40, value is $random")
    }

    /*
    * Create an array list of your favorite book titles. Loop over this list and,
    * if the title contains the letter ‘e’, print each character of the name on a newline.
    * */
    println("------- Code Challenge 2 ----------")
    val favBooks = arrayOf("Harry", "Avenger", "Conjuring", "Suzana")

    for (elm in favBooks) {

        if (elm.contains("e")) {
            for (char in elm) {
                println(char)
            }
        } else {
            println(elm)
        }
    }

}