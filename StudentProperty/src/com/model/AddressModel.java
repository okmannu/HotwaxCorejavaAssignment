package com.model;

import java.io.Serializable;

public class AddressModel implements Serializable {

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

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String city;
    private String state;
    private Integer pinCode;
    private String country;


    public AddressModel() {
    }

    public AddressModel(String city, String state, Integer pinCode, String country) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }
}
