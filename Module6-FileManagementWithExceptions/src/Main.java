import java.util.InputMismatchException;
import java.util.Scanner;

import model.Product;
import service.FileService;
import utils.FileManager;

public class Main {

    public static void main(String[] args) {

        FileService service =
                new FileService();

        Scanner input = new Scanner(System.in);

        FileManager.createFile();

        try{
        while (true) {

            System.out.println("\n===== Product System =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Products");
            System.out.println("4. Delete Products");
            System.out.println("5. Exit");

            System.out.print("Select Option: ");

            int choice;

            try {

                choice = input.nextInt();
                input.nextLine();

            }
            catch (InputMismatchException e) {

                System.out.println("Please enter a valid number.");

                input.nextLine();

                continue;

            }

            switch (choice) {

                case 1:

                    System.out.print("Product ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Product Name: ");
                    String name = input.nextLine();

                    try{

                        System.out.print("Price: ");

                        double price =
                                input.nextDouble();

                        input.nextLine();

                        Product product =
                                new Product(
                                        id,
                                        name,
                                        price
                                );

                        service.addProduct(product);

                    }
                    catch(IllegalArgumentException e){

                        System.out.println(
                                e.getMessage()
                        );

                    }

                    break;

                case 2:

                    service.viewProducts();

                    break;

                case 3:

                    System.out.print(
                            "Enter Product ID: "
                    );

                    int idP = input.nextInt();

                    input.nextLine();

                    Product productId = service.searchProduct(idP);

                    if (productId != null) {

                        System.out.println();

                        System.out.println(
                                "Product Found"
                        );

                        System.out.println(productId);

                    }

                    else {

                        System.out.println(
                                "Product not found."
                        );

                    }

                    break;

                case 4:

                    System.out.print(
                            "Enter Product ID: "
                    );

                    int iD =
                            input.nextInt();

                    input.nextLine();

                    boolean deleted =
                            service.deleteProduct(iD);

                    if(deleted){

                        System.out.println(
                                "Product deleted successfully."
                        );

                    }

                    else{

                        System.out.println(
                                "Product not found."
                        );

                    }

                    break;

                case 5:

                    System.out.println("Goodbye!");

                    return;

                default:

                    System.out.println("Invalid option.");

            }
        }

    }finally {

            input.close();

        }}
}