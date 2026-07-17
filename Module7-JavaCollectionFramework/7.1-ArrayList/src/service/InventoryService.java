package service;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class InventoryService {

    private List<Product> products =
            new ArrayList<>();

    public void addProduct(Product product) {

        Product existingProduct =
                searchProduct(product.getProductId());

        if (existingProduct != null) {

            System.out.println("Product ID already exists.");

            return;

        }

        products.add(product);

        System.out.println("Product added successfully.");

    }

    public void viewProducts() {

        if(products.isEmpty()){

            System.out.println(
                    "Inventory is empty."
            );

            return;

        }

        for(Product product : products){

            System.out.println(product);

            System.out.println("--------------------");

        }

    }

    public Product searchProduct(int productId) {

        for (Product product : products) {

            if (product.getProductId() == productId) {

                return product;

            }

        }

        return null;

    }

    public boolean updateProduct(
            int productId,
            String newName,
            double newPrice
    ) {

        Product product = searchProduct(productId);

        if (product == null) {

            return false;

        }

        product.setProductName(newName);
        product.setPrice(newPrice);

        return true;

    }

    public boolean deleteProduct(int productId) {

        Product product = searchProduct(productId);

        if (product == null) {

            return false;

        }

        products.remove(product);

        return true;

    }
}