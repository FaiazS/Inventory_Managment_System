package com.scaler.ProductCatalogue;

public class Furniture extends Product {

    private String material;

    public void setMaterial(String material) {

        this.material = material;
    }

    public String getMaterial() {

        return material;
    }

    private String color;

    public void setColor(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    private String style;

    public void setStyle(String style) {

        this.style = style;
    }

    public String getStyle() {

        return style;
    }

    public Furniture(Long productId, String productName, double productPrice, int productQuantity,String material, String color, String style) {

        super(productId, productName, productPrice, productQuantity);

        this.material = material;
        this.color = color;
        this.style = style;
    }
}
