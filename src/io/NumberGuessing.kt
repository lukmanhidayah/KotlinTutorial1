package io


fun main(args: Array<String>) {
    val number = (0..100).random()
    var input: String?
    var guess = -1

    while (guess != number){
        print("Guess a number between 1 to 100: ")
        input = readLine()

        if(input != null){
            // can throw NumberFormatException
            guess = input.toInt();
        }
        println(guess)

        if(guess < number){
            println("Too low")
        }else if(guess > number){
            println("Too large")
        }else{
            println("You won!!!")
        }
    }
//    println(number)


}