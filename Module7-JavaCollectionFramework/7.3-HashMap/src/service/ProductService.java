package service;

import java.util.HashMap;
import java.util.Map;

import model.Product;

public class ProductService {

    private Map<Integer, Product> products =
            new HashMap<>();

    public boolean addProduct(Product product) {

        if (products.containsKey(product.getProductId())) {

            return false;

        }

        products.put(
                product.getProductId(),
                product
        );

        return true;

    }

    public Product searchProduct(int productId) {

        return products.get(productId);

    }

    public boolean updateProduct(
            int productId,
            String newName,
            double newPrice
    ) {

        Product product =
                products.get(productId);

        if (product == null) {

            return false;

        }

        product.setProductName(newName);
        product.setPrice(newPrice);

        return true;

    }

    public boolean deleteProduct(int productId) {

        return products.remove(productId) != null;

    }

    public void viewProducts() {

        if (products.isEmpty()) {

            System.out.println("Inventory is empty.");

            return;

        }

        for (Product product : products.values()) {

            System.out.println(product);
            System.out.println("----------------------");

        }

    }

    public void showKeys(){

        for(Integer key : products.keySet()){

            System.out.println(key);

        }

    }

    public void showValues(){

        for(Product product : products.values()){

            System.out.println(product);

            System.out.println("----------------------");

        }

    }

    public void showEntries(){

        for(Map.Entry<Integer, Product> entry
                : products.entrySet()){

            System.out.println(
                    "Product ID : "
                            + entry.getKey()
            );

            System.out.println(
                    entry.getValue()
            );

            System.out.println("----------------------");

        }

    }
}