package com.codewithmosh;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    // Overloading methods to prevent the user from having to input a number within a range
    public static double readNumber(String prompt){
        //Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public static double readNumber(String prompt, double min, double max) {
        //Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
