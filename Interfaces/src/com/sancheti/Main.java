package com.sancheti;
public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2021(10000);
        var report = new TaxReport();
        report.show(calculator);
    }
}
