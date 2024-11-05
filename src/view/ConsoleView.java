package view;

import behavioral.LibraryObserver;
import behavioral.BookSortStrategy;
import model.Book;
import model.BookBuilder;
import structural.BookDecorator;
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
        System.out.println("0. Exit");
    }

    public Book createBook() {
        System.out.print("Enter title: ");
        String title = scanner.next();
        System.out.print("Enter author: ");
        String author = scanner.next();
        Book newBook = new BookBuilder().setTitle(title).setAuthor(author).build();
        BookDecorator decoratedBook = new BookDecorator(newBook) {
            @Override
            public String getDescription() {
                return newBook.getTitle() + " by " + newBook.getAuthor();
            }
        };
        libraryObserver.notifyObservers("New book added: " + decoratedBook.getDescription());
        return decoratedBook;
    }

    public int getUserInput() {
        return scanner.nextInt();
    }

    public void showBooks(List<Book> books) {
        bookSortStrategy.sort(books);
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}