package oop

// function inheritance is avoid code duplication on your project
// to create a class as parent by adding open word name in front of class word
open class PersonInheritance(open val name: String, open var age: Int) {
    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age
}


class StudentChild(override val name: String, override var age: Int, val studentId: Long) : PersonInheritance(name, age) {
    fun isIntelligent() = true
}

class EmployeeChild(override val name: String, override var age: Int) : PersonInheritance(name, age) {
    fun receivePayment() = "Receive Payment"
}

fun main(args: Array<String>) {
    val student = StudentChild("John", 29, 122342)
    student.age = 18
    student.speak();
    println(student.isIntelligent())

    val employee = EmployeeChild("Marry", 20)
    employee.speak()
    println(employee.receivePayment())
}