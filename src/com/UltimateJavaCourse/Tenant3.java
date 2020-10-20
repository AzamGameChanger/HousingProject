package com.UltimateJavaCourse;

public class Tenant3 extends House {
    private int monthlyPayment;

    public Tenant3(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms);
        this.monthlyPayment=monthlyPayment;
    }
}
