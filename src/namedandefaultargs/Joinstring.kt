package namedandefaultargs

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun main(args: Array<String>) {
    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))

    println(listOf(1, 2, 3).joinToString(postfix = "."))

    displaySeparator(size = 3, character = '5')
}