package oop

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse() : Course("kotlin", 9999.9), Learnable {
    final override fun learn() {
        super<Learnable>.learn(); // use '<>' to avoid ambiguity
        println("I'm one of the first people to learn Kotlin")
    }
}


fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()

}