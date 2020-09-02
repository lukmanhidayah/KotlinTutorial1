package NullSafety

fun main(args: Array<String>) {
    // you can solve nullable value using question mark
    var x: String? = null
    x = "Lukman"
    println(x.length)
    println(x?.length)//it's not necessary

    var z: String? = "Hidayah"
    z = null
    println(z?.length)

    var yvv: String = "Contoh" // can't make 'vvv' variable to null
    //vvv = null it will be error


    var zzz: String = ""
    zzz = "Contoh2"
    println(zzz)

    var b: String? = null
    val l = b?.length ?: -1
    println(l)

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)



}