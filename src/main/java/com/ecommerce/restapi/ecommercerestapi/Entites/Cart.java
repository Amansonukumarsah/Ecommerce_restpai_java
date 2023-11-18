package com.ecommerce.restapi.ecommercerestapi.Entites;

public class Cart {
    
    // private user user;
    // priavte Product product
    private String quentity;

    
    public Cart() {
    }


    public Cart(String quentity) {
        this.quentity = quentity;
    }

    
    public String getQuentity() {
        return quentity;
    }


    public void setQuentity(String quentity) {
        this.quentity = quentity;
    }


    @Override
    public String toString() {
        return "Cart [quentity=" + quentity + "]";
    }

    

}
