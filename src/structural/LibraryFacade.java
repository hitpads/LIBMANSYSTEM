package structural;

import model.Book;
import model.Library;

public class LibraryFacade {
    private final Library library = Library.getInstance();

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        library.addBook(book);
    }

    public void listBooks() {
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
