package com.example.coffeeapp.models;

public class AddressDetail {
    private int idAddress;
    private int idCustomer;

    public AddressDetail(int idAddress, int idCustomer) {
        this.idAddress = idAddress;
        this.idCustomer = idCustomer;
    }
    public AddressDetail() {
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
}
