package iterations

fun main(args: Array<String>) {
    for (c in "Python") {
        if (c === 'o') {
            // it's not for performance
            // but the more common case is
            // that U want to skip unnecessary iterations
            // to save more computation time
            break
        }
        print(c)
    }
    println()

    val list = listOf("Book", "Table", "Laptop")
    for ((idx, elem) in list.withIndex()) {
        if (!elem.contains("o")) {
            // it's will skip array after array contain "o"
            // so Table can skip to loop
            // avoid this code if you really not need
            continue
        }
        println("index $idx is $elem")
    }
}