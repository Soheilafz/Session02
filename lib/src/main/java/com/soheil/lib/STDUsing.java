package com.soheil.lib;

public class STDUsing {

    public static void main(String[]args){
        StudentClass std = new StudentClass();
        std.setName("Soheil");
        std.setFamily("Afzali");
        std.setAge(25);
       String result = " My Name IS: " + std.getName()+ ","+
               " Your Family IS: " + std.getFamily() + "," +
               " Your Age IS: " + std.getAge();
       print(result);

    }

    static void print(String result) {
        System.out.println (result);
    }

}
