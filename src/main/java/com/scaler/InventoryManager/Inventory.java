package com.scaler.InventoryManager;

import com.scaler.ProductCatalogue.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory<T extends Product>{

    private HashMap<String, T> inventory;

    public Inventory(){

        this.inventory = new HashMap<>();

    }

    public void addInventory(String productId, T product){

        inventory.putIfAbsent(productId, product);

    }

    public void removeInventory(String productId){

        inventory.remove(productId);
    }

    public T getInventory(String productId){

        return inventory.get(productId);

    }

    public HashMap<String, T> getAllInventory(){

        for(HashMap.Entry<String,T> entry : inventory.entrySet()){

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
        return inventory;
    }

    public List<Product> getProducts(){

        return new ArrayList<>(inventory.values());
    }
}
