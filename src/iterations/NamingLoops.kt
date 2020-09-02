package iterations

fun main(args : Array<String>){
    outer@ for(i in 1..10){
        for(j in 1..10){
            if(i - j == 5){
                //it can break first first loop coz there is outer tag
                break@outer
            }
            println("i is $i and i - j is ($i - $j)")
        }
    }
}