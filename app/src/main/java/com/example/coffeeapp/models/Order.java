package com.example.coffeeapp.models;

import java.sql.Date;

public class Order {
    private String ID;
    private Date orderTime;
    private Float total;
    private Float shipFee;
    private Short state;
    private Short payMethod;
    private String IDAddress;
    private String IDDiscount;
    private String IDEmployees;

    public Order() {
    }

    public Order(String ID, Date orderTime, Float total, Float shipFee, Short state, Short payMethod, String IDAddress, String IDDiscount, String IDEmployees) {
        this.ID = ID;
        this.orderTime = orderTime;
        this.total = total;
        this.shipFee = shipFee;
        this.state = state;
        this.payMethod = payMethod;
        this.IDAddress = IDAddress;
        this.IDDiscount = IDDiscount;
        this.IDEmployees = IDEmployees;
    }

    public String getID() {
        return ID;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public Float getTotal() {
        return total;
    }

    public Float getShipFee() {
        return shipFee;
    }

    public Short getState() {
        return state;
    }

    public Short getPayMethod() {
        return payMethod;
    }

    public String getIDAddress() {
        return IDAddress;
    }

    public String getIDDiscount() {
        return IDDiscount;
    }

    public String getIDEmployees() {
        return IDEmployees;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setShipFee(Float shipFee) {
        this.shipFee = shipFee;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public void setPayMethod(Short payMethod) {
        this.payMethod = payMethod;
    }

    public void setIDAddress(String IDAddress) {
        this.IDAddress = IDAddress;
    }

    public void setIDDiscount(String IDDiscount) {
        this.IDDiscount = IDDiscount;
    }

    public void setIDEmployees(String IDEmployees) {
        this.IDEmployees = IDEmployees;
    }
}
