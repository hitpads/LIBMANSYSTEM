package behavioral;

import model.Book;

import java.util.Collections;
import java.util.List;

public class AuthorSort implements BookSortStrategy {
    @Override
    public void sort(List<Book> books) {
        Collections.sort(books, (a, b) -> a.getAuthor().compareTo(b.getAuthor()));
    }
}