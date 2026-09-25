import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Q04_LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();

    static void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);

        System.out.println("Book added successfully.");
    }

    static void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nLibrary Books:");

        for (Book book : books) {
            book.display();
            System.out.println("----------------");
        }
    }

    static void saveToFile() {

        try {
            FileWriter writer = new FileWriter("library.txt");

            for (Book book : books) {
                writer.write("Title: " + book.title + "\n");
                writer.write("Author: " + book.author + "\n");
                writer.write("----------------\n");
            }

            writer.close();

            System.out.println("Books saved to file.");

        } catch (IOException e) {
            System.out.println("Error while saving file.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        addBook("Java Programming", "James Gosling");
        addBook("Python Basics", "Guido van Rossum");
        addBook("Data Structures", "Mark Allen");

        displayBooks();

        saveToFile();

        sc.close();
    }
}