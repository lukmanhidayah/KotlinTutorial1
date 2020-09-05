package oop

//setter and getter on kotlin
class Animal {
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.age = 8
    animal.age = 2
    println(animal.age)
}