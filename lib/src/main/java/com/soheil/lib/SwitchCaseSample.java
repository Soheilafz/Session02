package com.soheil.lib;

public class SwitchCaseSample {

    public static void main(String[] args) {
        int age = 15;

        switch (age) {
            case 10:
                print("Child");
                break;
            case 15:
                print("Teenage");
                break;
            case 20:
                print("Young");
                break;
            default:
                print("Null");

        }


    }

    static void print(String msg) {
        System.out.println(msg);
    }
}
