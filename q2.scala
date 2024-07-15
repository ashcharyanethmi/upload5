object demo {

    // Define the Book case class
    case class Book(title: String, author: String, isbn: String)

    // Create an initial set containing at least three different books
    var books: Set[Book] = Set(
      Book("Madol Doova" , "Martin Wikramasinghe", "9780743273565"),
      Book("Magul Kama", "Kumaratunga Munidasa", "9780060935467"),
      Book("Dracula", "Lewis Carroll", "9780451524935")
    )

    // Function to add a new book to the library
    def addBook(book: Book): Unit = {
      books += book
      println(s"\nAdded book: $book")
    }

    // Function to remove a book from the library by its ISBN
    def removeBook(isbn: String): Unit = {
      val bookToRemove = books.find(_.isbn == isbn)
      bookToRemove match {
        case Some(book) =>
          books -= book
          println(s"\nRemoved book: $book")
        case None =>
          println(s"No book found with ISBN: $isbn")
      }
    }

    // Function to check if a book is already in the library by its ISBN
    def isBookInLibrary(isbn: String): Boolean = {
      books.exists(_.isbn == isbn);
    }

    // Function to display all books in the library
    def displayBooks(): Unit = {
      if (books.isEmpty) {
        println("No books in the library.")
      } else {
        println("\nBooks in the library:")
        books.foreach { book =>
          println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
        }
      }
    }

    def main(args: Array[String]): Unit = {
      // Display initial books
      displayBooks()

      // Add a new book
      val newBook = Book("Gamperaliya", "Martin Wickramasinghe", "9780060850524")
      addBook(newBook)

      // Display books after adding
      displayBooks()


      // Check if a book is in the library
      val isbnToCheck = "9780451524935"
      println(s"\nIs book with ISBN $isbnToCheck in library? ${isBookInLibrary(isbnToCheck)}")

      // Remove a book
      val isbnToRemove = "9780060935467"
      removeBook(isbnToRemove)

      // Display books after removal
      displayBooks()

      // Check if a removed book is still in the library
      println(s"\nIs book with ISBN $isbnToRemove in library? ${isBookInLibrary(isbnToRemove)}")
    }


}