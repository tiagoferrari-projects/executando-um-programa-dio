package com.dio.base;

public class Order {

    private final String code;
    private final int totalValue;

    public Order(String code,int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    // using switch and case
    public double calculateFee(){
        return switch (totalValue) {
            case 100 -> totalValue * 0.99;
            case 200 -> totalValue * 1.99;
            default -> totalValue;
        };
    }

    // using if
    /*
    public double calculateFee(){
        if (this.totalValue > 100){
            return this.totalValue * 0.99;
        }else {
            return this.totalValue;
        }
    }
    */

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                ", totalValue=" + totalValue +
                '}';
    }
}
