package com.example.coffeeapp.models;

import java.util.Date;
import java.util.Timer;

public class Bill {
    private int id;
    private int idOrder;
    private Date orderDate;
    private Timer orderTime;

    public Bill(int id, int idOrder, Date orderDate, Timer orderTime) {
        this.id = id;
        this.idOrder = idOrder;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
    }
    public Bill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Timer getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timer orderTime) {
        this.orderTime = orderTime;
    }
}
