package service;

import java.util.ArrayList;

import model.Book;

public class LibraryService {

    private ArrayList<Book> books;

    public LibraryService() {

        books = new ArrayList<>();

    }

    // Add Book
    public void addBook(Book book) {

        if (searchBook(book.getBookId()) != null) {

            System.out.println("\nBook ID already exists.");
            return;

        }

        books.add(book);

        System.out.println("\nBook added successfully.");

    }

    // View All Books
    public void viewBooks() {

        if (books.isEmpty()) {

            System.out.println("\nNo books available.");
            return;

        }

        for (Book book : books) {

            System.out.println(book);
            System.out.println("--------------------------");

        }

    }

    // Search Book
    public Book searchBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                return book;

            }

        }

        return null;

    }

    // Borrow Book
    public boolean borrowBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            return false;

        }

        if (!book.isAvailable()) {

            return false;

        }

        book.setAvailable(false);

        return true;

    }

    // Return Book
    public boolean returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            return false;

        }

        if (book.isAvailable()) {

            return false;

        }

        book.setAvailable(true);

        return true;

    }

    // Delete Book
    public boolean deleteBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            return false;

        }

        books.remove(book);

        return true;

    }

}