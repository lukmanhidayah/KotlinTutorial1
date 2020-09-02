package collections

fun main(args: Array<String>) {


//    val list = listOf("Orange", "Apple", "Banana") // immutable

    //list
    val arrayList = arrayListOf("Lukman", "Lutfi", "Obama") // mutable
    val list = arrayListOf("Peter")
    println(arrayList[0])

    val concatArray = arrayList + list
    println(concatArray)

    println(arrayList.size)
    println(arrayList.isEmpty())

    println(arrayList.contains("Lukman"))

    //adding value
    arrayList.add("Josh")

    //replace value on arrayList
    val replaced = arrayList.add(1, "Jack")
    println(arrayList)

    //remove value on arrayList
    val removed = arrayList.remove("Lukman")
    println(arrayList)
    println(removed)

    //sublist is print value from n to n+ on arrayList
    val subList = arrayList.subList(1, 4)
    println(arrayList)
    println(subList)

}