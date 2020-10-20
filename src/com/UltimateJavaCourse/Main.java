package com.UltimateJavaCourse;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        House house  = new House("Duplex", "1981 E 16th St", 5);
        House tenant = new Tenant1("Atoullo", "1981 E 16th St", 1, 550);
        House tenant1 = new Tenant2("Azam", "1981 E 16th St", 2, 550);
        House tenant2 = new Tenant3("Amin", "1981 E 16th St", 3, 550);
        House tenant3 = new Tenant4("Khodzha", "1981 E 16th St", 4, 550);

        System.out.println(tenant.getName());
        System.out.println(tenant1.getName());
        System.out.println(tenant2.getName());
        System.out.println(tenant3.getName());
    }
}
