package oop

class PersonWithConstructor(val name: String, var age: Int) {

//or we can use as example below
//class PersonWithConstructor(name: String, age: Int) {
//    val name: String = name
//    var age: Int = age

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - this.age

}

fun main(args: Array<String>) {
    val personWithConstructor = PersonWithConstructor("Lukman", 79); // instantiation

    println(personWithConstructor.name)
    println(personWithConstructor.age)

    println(personWithConstructor.getYearOfBirth())
}