package model;

public class DigitalBook implements Book {
    private final String title;
    private final String author;

    public DigitalBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getType() {
        return "Digital";
    }
}