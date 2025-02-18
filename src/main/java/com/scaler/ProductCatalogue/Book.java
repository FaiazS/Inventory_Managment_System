package com.scaler.ProductCatalogue;

public class Book extends Product {

    private String author;

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getAuthor() {

        return author;
    }

    public Book(long productId, String productName, double productPrice, int productQuantity, String author) {

        super(productId, productName, productPrice,productQuantity);
        this.author = author;

    }


}
