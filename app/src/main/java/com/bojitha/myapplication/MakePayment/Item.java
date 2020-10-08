package com.bojitha.myapplication.MakePayment;

public class Item {
    private int imgResId;
    private String alias;
    private String number;
    private double amount;

    public Item(int imgResId, String alias, String number) {
        this.imgResId = imgResId;
        this.alias = alias;
        this.number = number;
        this.amount = 10.00;
    }

    public int getImgResId() {
        return imgResId;
    }

    public String getAlias() {
        return alias;
    }

    public String getNumber() {
        return number;
    }

    public double getAmount() { return amount; }
}
