package model;

public class Product {

    private int productId;
    private String productName;
    private double price;

    public Product(
            int productId,
            String productName,
            double price
    ) {

        this.productId = productId;
        this.productName = productName;
        setPrice(price);

    }

    public int getProductId() {

        return productId;

    }

    public void setProductId(int productId) {

        this.productId = productId;

    }

    public String getProductName() {

        return productName;

    }

    public void setProductName(String productName) {

        this.productName = productName;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {

        if(price < 0){

            throw new IllegalArgumentException(
                    "Price cannot be negative."
            );

        }

        this.price = price;

    }

    @Override
    public String toString() {

        return productId +
                "," +
                productName +
                "," +
                price;

    }

}