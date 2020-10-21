package com.UltimateJavaCourse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<House> houses = new ArrayList<>();

        House tenant = new Tenant1("Atoullo", "1981 E 16th St", 1, 550);
        House tenant1 = new Tenant2("Azam", "1981 E 16th St", 2, 550);
        House tenant2 = new Tenant3("Amin", "1981 E 16th St", 3, 550);
        House tenant3 = new Tenant4("Khodzha", "1981 E 16th St", 4, 550);

        houses.add(tenant);
        houses.add(tenant1);
        houses.add(tenant2);
        houses.add(tenant3);

        System.out.println("___<Tenants>___");

        for (House h : houses) {
            System.out.println(h.getName());
        }

        System.out.println("<<___Monthly rent___>>");

        int total=0;
        for (House income:houses){
            total = total + income.getMonthlyPayment();
        }
        System.out.println(total);
    }
}
