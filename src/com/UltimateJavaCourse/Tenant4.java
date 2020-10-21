package com.UltimateJavaCourse;

public class Tenant4 extends House implements MonthlyRent{

    public Tenant4(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms, monthlyPayment);
    }

    @Override
    public void getPayment() {
        super.getMonthlyPayment();
    }
}
