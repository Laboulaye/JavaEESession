package com.study;

//корзина интернет-магазина
public class Cart {
    private String name; //наименование товара
    private int quanity; //количество шт.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
}
