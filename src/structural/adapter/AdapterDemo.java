package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new NewEmployee(1, "victor", "costa", "victoraweb@gmail.com");
        employees.add(e1);

        // Does not work!
        // Employee e2 = new LegacyEmployee(1, "nikita", "costa", "nikita@gmail.com");
        LegacyEmployee e2 = new LegacyEmployee(1, "nikita", "costa", "nikita@gmail.com");
        employees.add(new LegacyEmployeeAdapter(e2));

        System.out.println(employees.toString());
    }
}
