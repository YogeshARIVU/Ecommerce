package com.example.Ecommerce.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private double productPrice;

    @Column(length = 1000)
    private String productDesc;
    private String category;
    private String features;
    private String image;


    public Product() {}

    public Product(String productName, double productPrice, String productDesc,
                   String category, String features, String image) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.category = category;
        this.features = features;
        this.image = image;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getProductPrice() { return productPrice; }
    public void setProductPrice(double productPrice) { this.productPrice = productPrice; }

    public String getProductDesc() { return productDesc; }
    public void setProductDesc(String productDesc) { this.productDesc = productDesc; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getFeatures() { return features; }
    public void setFeatures(String features) { this.features = features; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
