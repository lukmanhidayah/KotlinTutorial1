package io

fun main(args: Array<String>) {
    print("Enter word to guess: ")
    val word = readLine()

    if (word == null) {
        println("No word given, game ended.")
        return
    }
    for (i in 1..100) {
        println()
    }
    //flow on the background
    //Tree
    //tree
    // ['t', 'r', 'e', 'e']
    //{'t', 'r', 'e'}
    var letters = word.toCharArray().toHashSet()
    var correctGuesses = mutableSetOf<Char>()
    var fails = 0
    while (letters != correctGuesses) {
        //print the word that has been guessed so far
        // _______
        // _e_
        printExplodeWord(word, correctGuesses)
        println("#wrong guesses $fails\n\n")
        print("Guess letter: ")
        var input = readLine()
        if (input == null) {
            continue
        } else if (input.length != 1) {
            println("Please enter one letter")
            continue
        }

        if (word.toLowerCase().contains(input.toLowerCase())) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            ++fails
        }
    }

    printExplodeWord(word, correctGuesses)
    println("Well done")


}

fun printExplodeWord(word: String, correctGuesses: Set<Char>) {
    for (el in word.toLowerCase()) {
        if (correctGuesses.contains(el)) {
            print("$el ")
        } else {
            print("_ ")
        }
    }
    println()
}
