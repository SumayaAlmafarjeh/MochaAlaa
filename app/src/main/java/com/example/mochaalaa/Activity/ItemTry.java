package com.example.mochaalaa.Activity;

public class ItemTry {
    private String size;
    private String sugar;
    private String topping;
    private String breadType;
    private double itemPrice;
    private String name;
    private int imageRes;

    public ItemTry(String name, String size, String sugar, String topping, int imageRes,double itemPrice) {
        this.name = name;
        this.size = size;
        this.sugar = sugar;
        this.topping = topping;
        this.imageRes = imageRes;
        this.itemPrice=itemPrice;

    }
    public ItemTry(String name, String breadType,  String topping, int imageRes,double itemPrice) {
        this.name = name;
        this.breadType = breadType;
        this.topping = topping;
        this.imageRes = imageRes;
        this.itemPrice=itemPrice;
    }
    public ItemTry(String name,String sugar, int imageRes,double itemPrice) {
        this.name = name;
       this.sugar=sugar;
        this.imageRes = imageRes;
        this.itemPrice=itemPrice;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getSugar() {
        return sugar;
    }

    public String getTopping() {
        return topping;
    }

    public int getImageRes() {
        return imageRes;
    }
}
