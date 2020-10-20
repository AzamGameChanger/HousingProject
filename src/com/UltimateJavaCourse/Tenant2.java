package com.UltimateJavaCourse;

public class Tenant2 extends House {
    private int monthlyPayment;
    public Tenant2(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms);
        this.monthlyPayment=monthlyPayment;
    }
}
