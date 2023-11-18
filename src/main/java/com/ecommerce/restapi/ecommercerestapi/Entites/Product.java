package com.ecommerce.restapi.ecommercerestapi.Entites;

public class Product {

    private String title;
    private String sellingPrice;
    private String discountPrice;
    private String description;
    private String categories;
    private String image;


    
    public Product(String title, String sellingPrice, String discountPrice, String description, String categories,
            String image) {
        this.title = title;
        this.sellingPrice = sellingPrice;
        this.discountPrice = discountPrice;
        this.description = description;
        this.categories = categories;
        this.image = image;
    }



    
    public Product() {
    }




    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public String getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategories() {
        return categories;
    }
    public void setCategories(String categories) {
        this.categories = categories;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }




    @Override
    public String toString() {
        return "Product [title=" + title + ", sellingPrice=" + sellingPrice + ", discountPrice=" + discountPrice
                + ", description=" + description + ", categories=" + categories + ", image=" + image + "]";
    }


    
    
}
