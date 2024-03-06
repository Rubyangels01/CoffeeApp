package com.example.coffeeapp.models;

import java.util.Date;
import java.util.Timer;

public class Address {
    private int id;
    private String addressName;
    private String addressType;
    private String phone;

    public Address(int id, String addressName, String addressType, String phone) {
        this.id = id;
        this.addressName = addressName;
        this.addressType = addressType;
        this.phone = phone;
    }
    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
