package model;

public class PhysicalBook implements Book {
    private final String title;
    private final String author;

    public PhysicalBook(String title, String author) {
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
        return "Physical";
    }
}