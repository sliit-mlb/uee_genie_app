package com.bojitha.myapplication.MakePayment;

public class Item {
    private int imgResId;
    private String alias;
    private String number;

    public Item(int imgResId, String alias, String number) {
        this.imgResId = imgResId;
        this.alias = alias;
        this.number = number;
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
}
