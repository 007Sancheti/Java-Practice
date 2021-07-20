package com.sancheti;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        var browser = new Browser();
//        browser.navigate("...");
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
