package com.ecommerce.restapi.ecommercerestapi.Entites;

// import jakarta.annotation.Generated;
// import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class user {

    @Id
    // @Generated
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Generated(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 20)
    private String name;

    @Column(length = 200)
    private String lastName;

    @OneToMany
    private Customer customer;

    public user() {
    }

    public user(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
    }

}
