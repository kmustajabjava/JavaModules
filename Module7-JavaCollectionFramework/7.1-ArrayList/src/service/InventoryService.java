package service;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class InventoryService {

    private List<Product> products =
            new ArrayList<>();

    public void addProduct(Product product){

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

}