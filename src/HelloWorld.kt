
import java.math.BigInteger
import functions.getCurrentDate
import oop.Color


fun main(args: Array<String>) {
    //perbedaan var dan val adalah
    //var itu digunakan untuk value yang bisa diubah dikemudian hari
    //val itu untuk constanta
    var str: String = "Hello, i am student!"
    val age: Int = 24
    val bigInt= BigInteger("3")
    val color = Color.BLUE
    println(str)
    println(getCurrentDate())
    println("what's up")
    println(age)
}