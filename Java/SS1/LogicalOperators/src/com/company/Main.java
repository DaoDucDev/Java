package com.company;

public class Main {

    public static void main(String[] args) {

        //Khai báo 2 biến kiểu boolean
        boolean bool1 = true, bool2 = false;

        //Toán tử logic AND
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));

        //Toán tử logic OR
        System.out.println("bool1 || bool2 = " + (bool1 || bool2) );

        //Toán tử logic NOT
        System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));
    }
}
