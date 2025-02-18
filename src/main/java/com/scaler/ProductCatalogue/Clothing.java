package com.scaler.ProductCatalogue;

public class Clothing extends Product {

    private int size;

    public void setSize(int size) {

        this.size = size;

    }

    public int getSize() {

        return size;
    }

    public Clothing(long productId, String productName, double productPrice, int productQuantity, int size) {

        super(productId, productName, productPrice,productQuantity);
        this.size = size;
    }
}
