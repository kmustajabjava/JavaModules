import model.Product;
import service.ProductService;

public class Main {

    public static void main(String[] args) {

        ProductService service =
                new ProductService();

        Product p1 =
                new Product(
                        101,
                        "Laptop",
                        150000
                );

        Product p2 =
                new Product(
                        102,
                        "Keyboard",
                        3500
                );

        Product p3 =
                new Product(
                        103,
                        "Mouse",
                        1800
                );

        // Add Products

        service.addProduct(p1);
        service.addProduct(p2);
        service.addProduct(p3);

        // View Products

        System.out.println("\n===== Inventory =====\n");

        service.viewProducts();

        // Search Product

        System.out.println("\n===== Search Product =====\n");

        Product found =
                service.searchProduct(102);

        if(found != null){

            System.out.println(found);

        }
        else{

            System.out.println("Product not found.");

        }

        // Update Product

        System.out.println("\n===== Update Product =====\n");

        boolean updated =
                service.updateProduct(
                        102,
                        "Mechanical Keyboard",
                        5500
                );

        if(updated){

            System.out.println("Product Updated");

        }
        else{

            System.out.println("Product not found.");

        }

        service.viewProducts();

        // Delete Product

        System.out.println("\n===== Delete Product =====\n");

        boolean deleted =
                service.deleteProduct(103);

        if(deleted){

            System.out.println("Product Deleted");

        }
        else{

            System.out.println("Product not found.");

        }

        service.viewProducts();

        // HashMap Iteration

        System.out.println("\n===== Product IDs =====\n");

        service.showKeys();

        System.out.println("\n===== Product Objects =====\n");

        service.showValues();

        System.out.println("\n===== Key -> Value =====\n");

        service.showEntries();

    }

}