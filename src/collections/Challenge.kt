package collections

import java.io.File

fun main(args: Array<String>) {
    val ipAddress = mutableMapOf<String, Int>()
    File("src/ips.txt").forEachLine {

//        if (ipAddress.contains("$it")) {
//            val totalIp = ipAddress[it]!!
//            ipAddress[it] = totalIp + 1
//        } else {
//            ipAddress[it] = 1
//        }
        // solution with simple approach
        val totalIp = ipAddress.getOrDefault(it, 0)
        ipAddress[it] = totalIp + 1

    }

    /*
    * Get
    * */

//    var maxIp = ipAddress.keys.first()
//    var maxCount = 0
//    for ((ip, count) in ipAddress.entries) {
//        if (count > maxCount) {
//            maxCount = count
//            maxIp = ip
//        }
//    }

    // solution with simple approach
    val (maxIp, maxCount) = ipAddress.entries.maxByOrNull { it.value } !!
    println("Most frequent IP address is $maxIp, which occurred $maxCount")

//
//    ipAddress.forEach {
//        println(it)
//    }

}