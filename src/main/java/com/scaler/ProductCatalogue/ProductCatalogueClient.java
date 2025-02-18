package com.scaler.ProductCatalogue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductCatalogueClient {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Clothing(1,"T.shirt",12.00,4,10));

        products.add(new Electronics(2,"Laptop",250.00,2,4));

        products.add(new Book(3,"Coding in Java",10.00,1,"James_Gosling"));

        for(Product product : products){

            System.out.println("Product Id: " + product.getProductId());

            System.out.println("Product Name: " + product.getProductName());

            System.out.println("Product Price: " + product.getProductPrice());

            System.out.println("Product Quantity: " + product.getProductQuantity());

        }

        Collections.sort(products);

        System.out.println("Sorted Products: ");

        for(Product product: products){

            System.out.println(product.getProductName());
        }
    }
}
