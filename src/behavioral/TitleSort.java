package behavioral;

import model.Book;
import java.util.Collections;
import java.util.List;

public class TitleSort implements BookSortStrategy {
    @Override
    public void sort(List<Book> books) {
        Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));
    }
}
