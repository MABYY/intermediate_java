package com.codewithmosh;

import java.text.NumberFormat;

public class MortgageReport {

    // Convert method to an instance method
    // private static MortgageCalculator calculator;
    private MortgageCalculator calculator;

    private NumberFormat currency;


    // Create construcor to initialize the calculator
    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
            //System.out.println(NumberFormat.getCurrencyInstance().format(balance))


        //for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
//        for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
//            //double balance = MortgageCalculator.calculateBalance(month);
//            double balance = calculator.calculateBalance(month);
//            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
 //       }
    }

    // Convert to instance method to have access to instance fields
    public void printMortgage() {
        // Since calculateMortgage is no longer static,
        // we have to create a  object
        //double mortgage = MortgageCalculator.calculateMortgage();
        //calculator = new MortgageCalculator(principal, annualInterest, years );
        double mortgage = calculator.calculateMortgage();
        //String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
