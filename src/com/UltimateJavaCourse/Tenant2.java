package com.UltimateJavaCourse;

public class Tenant2 extends House implements MonthlyRent{

    public Tenant2(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms, monthlyPayment);
    }

    @Override
    public void getPayment() {
        super.getMonthlyPayment();
    }
}
