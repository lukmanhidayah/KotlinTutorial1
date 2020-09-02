package oop

//Object oriented programming is one of many methods of programming
//
//Object describe with class
class Person {
    // Attribute describe with variable
    var name: String = "Lukman"
    var age: Int = 42

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

//    fun getYearOfBirt(): Int{
//        return 2020 - age
//    }
    fun getYearOfBirth() = 2020 - age
}

fun main(args: Array<String>) {
    val person = Person(); // instantiation

    println(person.name)
    println(person.age)

    println(person.getYearOfBirth())

    person.name = "Peter"

    println(person.name)

    person.speak()
    person.greet("Hidayah")



}