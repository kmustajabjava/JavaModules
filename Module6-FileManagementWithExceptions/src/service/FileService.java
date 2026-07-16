package service;

import model.Product;
import utils.FileManager;

public class FileService {

    public void addProduct(Product product) {

        FileManager.writeProduct(product);

    }

    public void viewProducts() {

        FileManager.readProducts();

    }

    public Product searchProduct(int id) {

        return FileManager.searchProduct(id);

    }

    public boolean deleteProduct(int productId){

        return FileManager.deleteProduct(productId);

    }

}