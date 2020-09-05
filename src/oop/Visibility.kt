package oop

//modifier on kotlin and that function
open class Visibility {
    private var age: Int = 19 // restricted modifier, only this class can using it
    protected var name = "Lion" // children of class can use it
    internal val isDangerous = true // only can use on one package only
    public val isPublic = true// all can use it

    fun isOld(): Boolean {
        return age > 12
    }
}

class Vertebrate : Visibility() {
    fun introduceYourself() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    val animal = Visibility()
}