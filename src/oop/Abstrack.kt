package oop

// function abstract is avoid the class parent used other than child class
// to create a class as abstract parent by adding abstract word name in front of class word
abstract class PersonAbstract(open val name: String, open var age: Int) {
    abstract fun speak()

    open fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age
}


class StudentPersonAbstract(override val name: String, override var age: Int, val studentId: Long) : PersonAbstract(name, age) {
    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, I'm student")
    }

    //    override fun greet(name: String) {
    //        println("Good Morning $name")
    //    }

    override fun greet(name: String) {
        super.greet(name)
    }

}

class EmployeePersonAbstract(override val name: String, override var age: Int) : PersonAbstract(name, age) {
    fun receivePayment() = "Receive Payment"

    override fun speak() {
        println("Hi, I'm employee")
    }
}

fun main(args: Array<String>) {
    val student = StudentPersonAbstract("John", 29, 122342)
    student.age = 18
    student.speak()
    student.greet("Zey")
    println(student.isIntelligent())

    val employee = EmployeePersonAbstract("Marry", 20)
    employee.speak()
    println(employee.receivePayment())

}