package com.UltimateJavaCourse;

public class House {
    private String name;
    private String address;
    private int rooms;

    public House(String name, String address, int rooms) {
        setAddress(address);
        setName(name);
        setRooms(rooms);
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
