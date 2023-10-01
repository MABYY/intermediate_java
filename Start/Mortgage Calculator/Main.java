package com.codewithmosh;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        MortgageReport.printMortgage(principal, annualInterest, years);
        MortgageReport.printPaymentSchedule(principal, annualInterest, years);
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

