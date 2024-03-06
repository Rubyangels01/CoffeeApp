package com.example.coffeeapp.models;

public class Employees {
    private String ID;
    private String name;
    private String address;
    private String number;
    private boolean gender;
    private boolean authority;

    public Employees() {
    }

    public Employees(String ID, String name, String address, String number, boolean gender, boolean authority) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.number = number;
        this.gender = gender;
        this.authority = authority;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public boolean isGender() {
        return gender;
    }

    public boolean isAuthority() {
        return authority;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAuthority(boolean authority) {
        this.authority = authority;
    }
}
