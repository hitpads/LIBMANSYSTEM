import behavioral.LibraryObserver;
import behavioral.BookObserver;
import behavioral.TitleSort;
import view.ConsoleView;
import model.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryObserver libraryObserver = new LibraryObserver();
        BookObserver bookObserver = new BookObserver();
        libraryObserver.addObserver(bookObserver);

        TitleSort titleSort = new TitleSort();
        ConsoleView consoleView = new ConsoleView(libraryObserver, titleSort);
        List<Book> books = new ArrayList<>();

        while (true) {
            consoleView.showMainMenu();
            int choice = consoleView.getUserInput();

            switch (choice) {
                case 1:
                    Book newBook = consoleView.createBook();
                    books.add(newBook);
                    break;
                case 2:
                    consoleView.showBooks(books);
                    break;
                case 3:
                    consoleView.deleteBook(books);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}