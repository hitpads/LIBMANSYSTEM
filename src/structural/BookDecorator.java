package structural;

import model.Book;

public abstract class BookDecorator extends Book {
    protected Book book;

    public BookDecorator(Book book) {
        super(book.getTitle(), book.getAuthor());
        this.book = book;
    }

    public abstract String getDescription();
}
