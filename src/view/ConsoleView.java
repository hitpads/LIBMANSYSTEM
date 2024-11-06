package view;

import behavioral.LibraryObserver;
import behavioral.BookSortStrategy;
import model.Book;
import model.BookBuilder;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);
    private final LibraryObserver libraryObserver;
    private final BookSortStrategy bookSortStrategy;

    public ConsoleView(LibraryObserver libraryObserver, BookSortStrategy bookSortStrategy) {
        this.libraryObserver = libraryObserver;
        this.bookSortStrategy = bookSortStrategy;
    }

    public void showMainMenu() {
        System.out.println("1. Add Book");
        System.out.println("2. List Books");
        System.out.println("3. Delete Book");
        System.out.println("0. Exit");
    }

    public Book createBook() {
        System.out.print("Enter title: ");
        String title = scanner.next();
        System.out.print("Enter author: ");
        String author = scanner.next();
        System.out.print("Enter type (Physical/Digital): ");
        String type = scanner.next();
        Book newBook = new BookBuilder().setTitle(title).setAuthor(author).setType(type).build();
        libraryObserver.notifyObservers("New book added: " + newBook.getTitle() + " (" + newBook.getType() + ")");
        return newBook;
    }

    public void showBooks(List<Book> books) {
        bookSortStrategy.sort(books);
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getType() + ")");
        }
    }

    public int getUserInput() {
        return scanner.nextInt();
    }

    public void deleteBook(List<Book> books) {
        System.out.println("Enter the title of the book to delete:");
        String title = scanner.next();
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("Book deleted if it existed.");
    }
}