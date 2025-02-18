package com.scaler.RecentlyViewedProducts;

import com.scaler.ProductCatalogue.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class RecentlyViewed<G extends Product> {

    private LinkedHashMap<String, G> recentlyViewedProducts;

    private final int maxRecentlyViewedProducts = 3;

    public RecentlyViewed(){

        this.recentlyViewedProducts = new LinkedHashMap<>();
    }

    public void addRecentlyViewedProducts(String productId,G product){

        recentlyViewedProducts.remove(productId);

        recentlyViewedProducts.put(productId, product);

        if(recentlyViewedProducts.size() > maxRecentlyViewedProducts){

            recentlyViewedProducts.remove(productId);
        }
    }

    public List<Product> getRecentlyViewedProducts(String productId){

        return new ArrayList<>(recentlyViewedProducts.values());
    }
}
