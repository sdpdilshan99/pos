package com.pos.entity;

import java.util.Arrays;

public class Product implements SuperEntity{
    private String productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private byte[] productQrcode;
    private byte[] productImage;



    public Product() {
    }

    public Product(String productId, String productName, String productDescription, double productPrice, int productQuantity, byte[] productQrcode, byte[] productImage) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productQrcode = productQrcode;
        this.productImage = productImage;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public byte[] getProductQrcode() {
        return productQrcode;
    }

    public void setProductQrcode(byte[] productQrcode) {
        this.productQrcode = productQrcode;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", productQrcode=" + Arrays.toString(productQrcode) +
                ", productImage=" + Arrays.toString(productImage) +
                '}';
    }
}
