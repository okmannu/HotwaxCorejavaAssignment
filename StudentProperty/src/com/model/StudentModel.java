package com.model;

import com.sun.deploy.security.ruleset.RuleSetParser;

import java.io.InputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentModel implements Serializable {


    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");

    private String firstName;
    private Date dateOfBirth ;
    private AddressModel address;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public AddressModel getAddress() {
        return address;
    }

    public StudentModel(String firstName, Date dateOfBirth, AddressModel address) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public StudentModel() {
    }
}
