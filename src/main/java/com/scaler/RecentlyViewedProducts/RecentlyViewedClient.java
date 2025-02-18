package com.scaler.RecentlyViewedProducts;

import com.scaler.ProductCatalogue.Book;
import com.scaler.ProductCatalogue.Clothing;
import com.scaler.ProductCatalogue.Electronics;
import com.scaler.ProductCatalogue.Product;

import java.util.List;

public class RecentlyViewedClient {

    public static void main(String[] args) {

        Product product1 = new Electronics(1,"Laptop",125.00,1,7);

        Product product2 = new Clothing(2,"T.shirt",12.50,1,11);

        Product product3 = new Book(3,"Coding In Java",10.00,1,"James Gosling");

        RecentlyViewed recentlyViewed = new RecentlyViewed();

    }
}
