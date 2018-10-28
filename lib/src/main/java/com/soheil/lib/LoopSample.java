package com.soheil.lib;

public class LoopSample {
    public static void main(String[] args) {
        int a = 1;
        while (a < 20) {
            System.out.println("a IS " + a);
            a++;
        }

        int b = 20;
        for (int i = 1; i <= b; i++) {
            System.out.println("I IS " + i);
        }

        int c = 2;
        do {
            System.out.println("C IS " + c);
        }while (c < 2);
    }


}
