package controller;

import view.ConsoleView;
import model.Library;
import behavioral.LibraryObserver;
import behavioral.BookObserver;
import behavioral.TitleSort;

public class LibraryController {
    private final Library library;
    private final ConsoleView view;

    public LibraryController() {
        this.library = Library.getInstance();
        LibraryObserver libraryObserver = new LibraryObserver();
        BookObserver bookObserver = new BookObserver();
        libraryObserver.addObserver(bookObserver);
        this.view = new ConsoleView(libraryObserver, new TitleSort());
    }

    public void start() {
        int option;
        do {
            view.showMainMenu();
            option = view.getUserInput();
            handleOption(option);
        } while (option != 0);
    }

    private void handleOption(int option) {
        switch (option) {
            case 1: library.addBook(view.createBook()); break;
            case 2: view.showBooks(library.getBooks()); break;
            case 0: System.out.println("Exiting..."); break;
            default: System.out.println("Invalid option."); break;
        }
    }
}