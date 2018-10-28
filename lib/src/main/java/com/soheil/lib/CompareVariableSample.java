package com.soheil.lib;

public class CompareVariableSample {
    public static void main(String[] args) {
        getByAge();
    }

    static void getByAge() {
        int myAge = 43;
        int yourAge = 40;

        if (myAge > yourAge) {
            print("I Am Greator");
        } else if (yourAge > myAge) {
            print("You Are Greator");
        } else {
            print("Null");
        }
    }

    static void print(String msg) {
        System.out.println(msg);
    }
}
