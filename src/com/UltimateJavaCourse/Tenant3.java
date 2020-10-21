package com.UltimateJavaCourse;

public class Tenant3 extends House implements MonthlyRent {

    public Tenant3(String name, String address, int rooms, int monthlyPayment) {
        super(name, address, rooms,monthlyPayment);
    }

    @Override
    public void getPayment() {
        super.getMonthlyPayment();
    }
}
