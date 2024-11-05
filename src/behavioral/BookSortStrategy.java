package behavioral;

import model.Book;
import java.util.List;

public interface BookSortStrategy {
    void sort(List<Book> books);
}
