package com.codewithmosh;

import java.text.NumberFormat;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}


//    Static is a keyword. The role of adding static before any entity
//    is to make that entity a class entity. It means that adding static before
//    methods and variables make them class methods and class variables
//    respectively,  instead of instance methods and instance variables.
//    Hence, static methods and variables can be directly accessed with the
//    help of Class, which means that there is no need to create objects in order
//    to access static methods or variables.
// https://www.geeksforgeeks.org/understanding-static-in-public-static-void-main-in-java/



// Static methods: When a method is declared with static keyword,
// it is known as static method. As discussed above, any static member
// can be accessed before any objects of its class are created, and without
// reference to any object.
//
//// Making a static function
//   class GfG {
//    static void func()
//    {}
// }
//
//// Calling a static function
// GfG.func();

// Static methods can only see static fields of a class.
// You can't access private fields of a class.
// Make the static parameter from the method and you will fix this problem.

