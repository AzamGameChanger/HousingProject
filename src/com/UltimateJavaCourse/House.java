package com.UltimateJavaCourse;

public class House {
    private String name;
    private String address;
    private int rooms;
    private int monthlyPayment;

    public House(String name, String address, int rooms, int monthlyPayment) {
        setAddress(address);
        setName(name);
        setRooms(rooms);
        setMonthlyPayment(monthlyPayment);
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    private void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    private void setRooms(int rooms) {
        this.rooms = rooms;
    }




}
