package com.ecommerce.restapi.ecommercerestapi.Entites;

public class Orderplace {

    // private user user;
    // private Customer customer;
    // private Product product;
    private String order_date;
    private String quentity;

    public Orderplace() {
    }

    public Orderplace(String order_date, String quentity) {
        this.order_date = order_date;
        this.quentity = quentity;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getQuentity() {
        return quentity;
    }

    public void setQuentity(String quentity) {
        this.quentity = quentity;
    }

    @Override
    public String toString() {
        return "Orderplace [order_date=" + order_date + ", quentity=" + quentity + "]";
    }

}
