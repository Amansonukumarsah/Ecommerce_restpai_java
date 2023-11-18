package com.ecommerce.restapi.ecommercerestapi.Entites;

public class Customer {

   
    private String name;
    private String city;
    private String state;
    private int pinCode;


    
    private user user;

    
    public Customer() {
    }



    public Customer(String name, String city, String state, int pinCode) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }




    @Override
    public String toString() {
        return "Customer [name=" + name + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
    }

    

}
