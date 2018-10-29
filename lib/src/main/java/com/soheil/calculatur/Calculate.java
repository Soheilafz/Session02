package com.soheil.calculatur;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        getCalculate();
    }

    static double calculator(double first, double last, String action) {
        double result = 0;
        switch (action) {
            case "+":
                result = first + last;
                break;
            case "-":
                result = first - last;
                break;
            case "/":
                result = first / last;
                break;
            case "*":
                result = first * last;
                break;
        }
        return result;

    }

    static void getCalculate() {
        Scanner scanner = new Scanner(System.in);
        print("Enter First Number");
        double first = scanner.nextDouble();
        print("Enter Action");
        String action = scanner.next();
        print("Enter Last Number");
        double last = scanner.nextDouble();
        double result = calculator(first, last, action);
        print("Result IS " + result);
    }

    static void print(String msg) {
        System.out.println(msg);
    }


}
