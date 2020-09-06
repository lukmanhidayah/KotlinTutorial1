package oop

//DRY = don't repeat yourself(code, logic, and etc.)

open class Stack<E>(vararg val items: E) {
    var elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null

    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

//function generic
fun <T> stackOf(vararg elements: T): Stack<T>{
    return Stack(*elements) // spread operator is back to element to vararg T
}

fun main(args: Array<String>) {
    val stack = Stack(1, 2, 3)
    val stack2 = stackOf("Hi", "Hello", "Hey")
    stack.push(11)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    for(i in 1..3){
        println(stack2.pop())
    }
}