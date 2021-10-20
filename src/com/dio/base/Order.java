package com.dio.base;

public class Order {

    private final String code;
    private final int totalValue;

    private String[] items;

    public Order(String code,int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }
    private void printItems(){
        int i = 0;
        while (i < items.length){
            System.out.println(items[i]);
            i++;
        }
    }
}
