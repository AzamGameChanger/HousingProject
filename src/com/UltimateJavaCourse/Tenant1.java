package com.UltimateJavaCourse;

public class Tenant1 extends House {
    private int monthlyPayment;

    public Tenant1(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms);
        this.monthlyPayment=monthlyPayment;
    }
}
