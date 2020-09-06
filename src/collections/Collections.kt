package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Lukman", 20), Pair("Roger", 22))
    val namesToAges2 = mapOf(
            "Hidayah" to 29,
            "Zeyan" to 31
    )

    println(namesToAges === namesToAges2)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToInhabitans =  mutableMapOf(
            "Germany" to 80_0000_000,
            "USA" to 300_000_000
    )

    countryToInhabitans.put("Australia", 23_000_000)
    countryToInhabitans.putIfAbsent("USA", 320_000_000)
    println(countryToInhabitans)
    println(countryToInhabitans.containsKey("Australia"))
    println(countryToInhabitans.containsValue(23_000_000))

    println(countryToInhabitans.get("Germany"))
    println(countryToInhabitans.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }
}