package iterations

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1 .. 10){
        sum += i
    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Python")

    for (element in list){
        println(element)
    }

    for ((index, value) in list.withIndex()){
        println("Element at $index is $value ")
    }
}