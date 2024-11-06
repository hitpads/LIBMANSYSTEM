package model;

public class BookBuilder {
    private String title;
    private String author;
    private String type;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Book build() {
        if ("Digital".equalsIgnoreCase(type)) {
            return new DigitalBook(title, author);
        } else {
            return new PhysicalBook(title, author);
        }
    }
}