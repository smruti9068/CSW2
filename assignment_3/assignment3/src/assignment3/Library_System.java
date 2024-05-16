package assignment3;

import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Library {
    private HashMap<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(int key, Book book) {
        books.put(key, book);
    }

    public void displayBooks() {
        System.out.println("Collection of Books in the Library:");
        for (Integer key : books.keySet()) {
            Book book = books.get(key);
            System.out.println("ID: " + book.getId() + ", Name: " + book.getName() + ", Author: " + book.getAuthor() + ", Quantity: " + book.getQuantity());
        }
    }

    public boolean containsBook(String bookName) {
        for (Book book : books.values()) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(int key) {
        books.remove(key);
        System.out.println("Book with ID " + key + " removed from the library.");
    }
}

public class Library_System {
    public static void main(String[] args) {
        Library library = new Library();

        // Instantiate at least two Book objects
        Book book1 = new Book(1, "Java Programming", "John Doe", 10);
        Book book2 = new Book(2, "Data Structures and Algorithms", "Jane Smith", 15);

        // Add books to the library
        library.addBook(101, book1);
        library.addBook(102, book2);

        // Display the collection of books in the library
        library.displayBooks();

        // (a.) Check if a particular book name is present in the map
        String searchBook = "Java Programming";
        System.out.println("Is book \"" + searchBook + "\" present in the library? " + library.containsBook(searchBook));

        // (b.) Remove the value associated with a particular key value
        int keyToRemove = 101;
        library.removeBook(keyToRemove);

        // Display the updated collection of books in the library
        library.displayBooks();
    }
}
