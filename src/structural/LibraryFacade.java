package structural;

import model.Book;
import model.Library;
import model.PhysicalBook;
import model.DigitalBook;

public class LibraryFacade {
    private final Library library = Library.getInstance();

    public void addBook(String title, String author, String type) {
        Book book;
        if (type.equalsIgnoreCase("Physical")) {
            book = new PhysicalBook(title, author);
        } else {
            book = new DigitalBook(title, author);
        }
        library.addBook(book);
    }

    public void listBooks() {
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}