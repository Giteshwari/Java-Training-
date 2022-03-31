package com.bean;


public class Book {


    private int bid;

    private String bname;

    private String aname;

    private float price;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(int bid, String bname, String aname, float price) {
        this.bid = bid;
        this.bname = bname;
        this.aname = aname;
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", aname='" + aname + '\'' +
                ", price=" + price +
                '}';
    }
}
