package com.UltimateJavaCourse;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        House house  = new House("Duplex", "1981 E 16th St", 5);
        House tenant = new Tenant1("Atoullo", "1981 E 16th St", 1, 550);

        System.out.println(tenant.getName());
    }
}
