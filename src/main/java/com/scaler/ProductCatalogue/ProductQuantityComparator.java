package com.scaler.ProductCatalogue;

import java.util.Comparator;

public class ProductQuantityComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2){

        if(p1.getProductQuantity() > p2.getProductQuantity()){

            return -1;
        }
        else if(p1.getProductQuantity() < p2.getProductQuantity()){

            return 1;
        }

        return 0;
    }
}
