package codeChallanges

/*
Create a class representing a book. Every book has a title, an author, a
publication year and is either borrowed or not. Choose an appropriate
data type for each of these properties.
A book can be borrowed from you or returned to you. In both cases, the
borrowed property is updated accordingly. Also, a book should be able
to print itself to the command line, including its title, author, and
publication year.
* */
class Book(val title: String, val author: String, val publicationYear: Int, var isBorrow: Boolean) {

    fun detailBook() {
        println("Title: ${this.title}, Author: ${this.author}, Publication Year: ${this.publicationYear}, Borrow Status:${this.isBorrow}")
    }

    fun borrow(): Boolean {
        return if(this.isBorrow === false){
            isBorrow = true
            true
        }else{
            println("Sorry, the book is already borrowed.")
            false;
        }
    }

    fun returnBook(): Boolean{
        return if(this.isBorrow === false){
            this.isBorrow = false;
            true
        }else{
            println("The book was not borrowed so it cannot be returned.")
            return false
        }
    }
}

fun main(args: Array<String>){
    val book = Book("Conjuring", "Liliana", 2000, false)
    book.detailBook();
    book.borrow()
    book.borrow()
    book.detailBook()
    book.returnBook()
    book.detailBook()
}