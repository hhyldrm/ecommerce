package com.ecommerce.model;

import javax.persistence.*;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;
    private String address;
    private String city;
    private String country;
    private String postCode;


    @ManyToOne
    @JoinColumn(name="user_id")

    private Users users;



    public UserDetails() {
    }

    public UserDetails(String phoneNumber, String address, String city, String country, String postCode) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
    }

    public UserDetails(Long id, String phoneNumber, String address, String city, String country, String postCode) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city=city;
        this.country = country;
        this.postCode = postCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
