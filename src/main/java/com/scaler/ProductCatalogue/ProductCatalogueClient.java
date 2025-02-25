package com.scaler.ProductCatalogue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ProductCatalogueClient {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Clothing(1,"T.shirt",12.00,4,10));

        products.add(new Electronics(2,"Laptop",2500.00,2,4));

        products.add(new Book(3,"Coding in Java",15.00,1,"James_Gosling"));

        products.add(new Furniture(4L,"Wardrobe",1750.00,1,"Teakwood","Brown","Contemporary"));

        for(Product product : products){

            System.out.println("Product Id: " + product.getProductId());

            System.out.println("Product Name: " + product.getProductName());

            System.out.println("Product Price: " + product.getProductPrice());

            System.out.println("Product Quantity: " + product.getProductQuantity());

        }

        Collections.sort(products);

        System.out.println("Comparable Sorted Products By Product Price: ");

        for(Product product: products){

            System.out.println(product.getProductName());
        }

        Collections.sort(products, new ProductQuantityComparator());

        System.out.println("Comparator Sorted Products By Product Quantity: ");

        for(Product product : products){

            System.out.println(product.getProductName());
        }

        // Printing all the item IDs via Map method using Java Streams API.

        products.stream()

                .map((product) -> {

                    return product.getProductId();

                })

                .forEach((productId) -> {

                    System.out.println("Product ID: " + productId);
                });


        //Defining a list of product names in lowercase and printing them using Java Streams API.

        products.stream()

                .map((product) -> {

                    return product.getProductName().toLowerCase();

        })

                .forEach((product) -> {

                    System.out.println("Product Name  : " + product);

                });

        //Filter items with a price greater than 1000 and a quantity greater than 0 (available stock).
        //Extract only the names of these items.
        //Remove duplicate names (if any).
        //Sort the names in alphabetical order.
        //Limit the result to the top 5 names.
        //Collect the final list into a List<String> and print it.


                List<String> shortListedProducts = products.stream()

                .filter((product) -> {

                    return product.getProductPrice() > 1000 && product.getProductQuantity() > 0;

                })

                .map((product) ->{

                    return product.getProductName();

                })


                .distinct()

                .sorted()

                .limit(2)

                .collect(Collectors.toList());


                 shortListedProducts.forEach((product) -> {

                    System.out.println("Product Name : " + product);

                });

        //Goal: Use reduce (Java Stream.reduce() - Scaler Topics) to aggregate data in a stream.
        //Practice:
        //Calculate the total quantity of all items in the inventory.
        //Find the most expensive item using reduce.
        //Concatenate all item names into a single comma-separated string.


                int totalQty = products.stream()

                               .map((product) -> product.getProductQuantity())

                               .reduce(0,(totalQuantity, quantity)-> {

                                totalQuantity += quantity;

                                return totalQuantity;
                });

                System.out.println("Total Qty : " + totalQty);

                      double maxPrice = products.stream()

                              .map((product) -> product.getProductPrice())

                              .reduce(Double.MIN_VALUE,(maximumPrice,currentPrice) ->{

                               return Math.max(maximumPrice,currentPrice);

                     });

                    System.out.println("Maximum Price : " + maxPrice);


                   String concatenatedProductNames = products.stream()

                                                             .map((product) -> product.getProductName())

                                                             .reduce("",(currentProductName, newProductName) -> {

                                                             return currentProductName + "," + newProductName;

                                                             });

                   System.out.println("Concatenated Products : " + concatenatedProductNames);

    }
}
