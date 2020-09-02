package conditions

fun main(args: Array<String>) {
    val age: Int = 20
    if(age < 18) {
        println("You can't register.")
    } else if (age < 21) {
        println("Well, maybe you an register.")
    } else {
        println("You're good to go.")
    }

    print("the end.")
}