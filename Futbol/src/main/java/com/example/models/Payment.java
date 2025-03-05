package com.example.models;

import java.util.Date;

public class Payment {
    private int id;
    private int playerId;
    private double amount;
    private Date date;
    private String status;

    public Payment(int id, int playerId, double amount, Date date, String status) {
        this.id = id;
        this.playerId = playerId;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}