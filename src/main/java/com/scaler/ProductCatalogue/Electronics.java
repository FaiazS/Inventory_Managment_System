package com.scaler.ProductCatalogue;

public class Electronics extends Product {

    private int warranty;

    public void setWarranty(int warranty) {

        this.warranty = warranty;

    }

    public int getWarranty() {

        return warranty;
    }

    public Electronics(long productId, String productName, double productPrice, int productQuantity,int warranty) {

        super(productId, productName, productPrice,productQuantity);
        this.warranty = warranty;
    }
}
