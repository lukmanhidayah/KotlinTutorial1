package conditions

fun main(args: Array<String>) {
    val mode: Int = 5

    when (mode) {
        1 -> println("The mode is lazy")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode.")
    }

    val result = when (mode) {
        1 -> println("The mode is lazy")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode.")
    }

    result
    if (mode < 2) {
        println("Mode is less than 2")
    } else {
        println("Mode is bigger than 2")
    }

    val x = if (mode < 2) {
        println("Mode is less than 2")
    } else {
        println("Mode is bigger than 2")
    }
    x
}