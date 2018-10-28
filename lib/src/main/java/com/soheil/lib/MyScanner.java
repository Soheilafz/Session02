package com.soheil.lib;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        print("Enter Your Name");
        String name =scanner.next();
        print("Enter Your Family");
        String family =scanner.next();

        print("Your Name IS " + name);
        print("Your Family IS " + family);



    }


    static void print(String msg) {
        System.out.println(msg);
    }
}
