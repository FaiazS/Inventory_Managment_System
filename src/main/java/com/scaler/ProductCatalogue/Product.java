package com.scaler.ProductCatalogue;

public class Product implements Comparable<Product>{

    private long productId;

    public void setProductId(long productId) {

        this.productId = productId;
    }
    public long getProductId() {

        return productId;
    }

    private String productName;

    public void setProductName(String productName) {

        this.productName = productName;
    }
    public String getProductName() {

        return productName;

    }

    private double productPrice;

    public void setProductPrice(double productPrice) {

        this.productPrice = productPrice;
    }

    public double getProductPrice() {

        return productPrice;
    }

    private int productQuantity;

    public void setProductQuantity(int productQuantity) {

        this.productQuantity = productQuantity;
    }

    public int getProductQuantity() {

        return productQuantity;
    }

    public Product(long productId, String productName, double productPrice, int productQuantity) {

        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    @Override
    public int compareTo(Product secondProduct){

        // Lower price comes first, thus return -1. (Sorting by Price Ascending Order).

        if(this.productPrice < secondProduct.productPrice){

            return  -1;
        }

        else if(this.productPrice > secondProduct.productPrice){

            return 1;
        }
        return 0;
    }
}
