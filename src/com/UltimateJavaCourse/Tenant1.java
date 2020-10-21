package com.UltimateJavaCourse;

public class Tenant1 extends House implements MonthlyRent{


    public Tenant1(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms, monthlyPayment);

    }

    @Override
    public void getPayment() {
        super.getMonthlyPayment();

    }
}
