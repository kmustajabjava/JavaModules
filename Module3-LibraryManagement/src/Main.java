import java.util.Scanner;
import model.Book;
import service.LibraryService;
import utils.InputValidator;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LibraryService service = new LibraryService();

        while (true) {

            System.out.println("\n==============================");
            System.out.println(" Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.println("==============================");

            System.out.print("Select Option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Book ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Title: ");
                    String title = input.nextLine();

                    System.out.print("Author: ");
                    String author = input.nextLine();

                    System.out.print("Category: ");
                    String category = input.nextLine();

                    if (!InputValidator.isValidTitle(title)) {

                        System.out.println("Invalid title.");
                        break;

                    }

                    if (!InputValidator.isValidAuthor(author)) {

                        System.out.println("Invalid author.");
                        break;

                    }

                    if (!InputValidator.isValidCategory(category)) {

                        System.out.println("Invalid category.");
                        break;

                    }

                    Book book = new Book(
                            id,
                            title,
                            author,
                            category
                    );

                    service.addBook(book);

                    break;

                case 2:

                    service.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID: ");

                    id = input.nextInt();
                    input.nextLine();

                    Book found = service.searchBook(id);

                    if (found != null) {

                        System.out.println(found);

                    } else {

                        System.out.println("Book not found.");

                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID: ");

                    id = input.nextInt();
                    input.nextLine();

                    if (service.borrowBook(id)) {

                        System.out.println("Book borrowed successfully.");

                    } else {

                        System.out.println("Book unavailable or not found.");

                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID: ");

                    id = input.nextInt();
                    input.nextLine();

                    if (service.returnBook(id)) {

                        System.out.println("Book returned successfully.");

                    } else {

                        System.out.println("Book was not borrowed or not found.");

                    }

                    break;

                case 6:

                    System.out.print("Enter Book ID: ");

                    id = input.nextInt();
                    input.nextLine();

                    if (service.deleteBook(id)) {

                        System.out.println("Book deleted successfully.");

                    } else {

                        System.out.println("Book not found.");

                    }

                    break;

                case 7:
                    input.close();
                    return;

                default:

                    System.out.println("Invalid option.");

            }

        }

    }

}