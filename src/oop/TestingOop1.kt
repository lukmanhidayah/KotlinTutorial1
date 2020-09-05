package oop

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(val title: String, val genre: String, val publicationYear: Int, var isBorrow: Boolean) : Lendable {
    override fun borrow() {
        if (!isBorrow) {
            isBorrow = true
            println("Borrow successful")
        } else {
            println("This item is already borrowed.")
        }
    }

    override fun toString(): String {
        return "InventoryItem(title='$title', genre='$genre', publicationYear=$publicationYear, borrowed=$isBorrow)"
    }

    abstract fun copy(): InventoryItem

}

class BookTesting(title: String, val author: String, genre: String, publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {

    fun read() {
        println("Reading a book by $author...")
    }

    override fun copy(): InventoryItem {
        val copy = BookTesting(title, author, genre, publicationYear)
        copy.isBorrow = this.isBorrow

        return copy
    }


}

class DvdTesting(title: String, genre: String,val length: Int, publicationYear: Int) : InventoryItem(title, genre, publicationYear, false ) {
    fun watch() {
        println("Watching $title...")
    }

    override fun copy(): InventoryItem {
        val copy = DvdTesting(title, genre, length, publicationYear)
        copy.isBorrow = this.isBorrow

        return copy
    }
}

fun main(args: Array<String>) {
    val dvdTesting = DvdTesting("Conjuring", "Horror", 10, 2010)
    dvdTesting.borrow()
    println(dvdTesting)
    println(dvdTesting.copy())
}