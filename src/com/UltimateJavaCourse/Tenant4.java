package com.UltimateJavaCourse;

public class Tenant4 extends House {
    private int monthlyPayment;
    public Tenant4(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms);
        this.monthlyPayment=monthlyPayment;
    }
}
