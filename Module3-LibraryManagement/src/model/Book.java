package model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String category;
    private boolean available;

    public Book(int bookId,
                String title,
                String author,
                String category) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.available = true;

    }

    public int getBookId() {

        return bookId;

    }

    public void setBookId(int bookId) {

        this.bookId = bookId;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public String getAuthor() {

        return author;

    }

    public void setAuthor(String author) {

        this.author = author;

    }

    public String getCategory() {

        return category;

    }

    public void setCategory(String category) {

        this.category = category;

    }

    public boolean isAvailable() {

        return available;

    }

    public void setAvailable(boolean available) {

        this.available = available;

    }

    @Override
    public String toString() {

        return "\nBook ID    : " + bookId +
                "\nTitle      : " + title +
                "\nAuthor     : " + author +
                "\nCategory   : " + category +
                "\nAvailable  : " + (available ? "Yes" : "No");

    }

}