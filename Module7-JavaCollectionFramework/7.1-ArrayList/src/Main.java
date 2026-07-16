import model.Product;
import service.InventoryService;

public class Main {

    public static void main(String[] args) {

        InventoryService service =
                new InventoryService();

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

        service.addProduct(p1);

        service.addProduct(p2);

        service.addProduct(p3);

        System.out.println();

        System.out.println("Inventory");

        System.out.println();

        service.viewProducts();

    }

}