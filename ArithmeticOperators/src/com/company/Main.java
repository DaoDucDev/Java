package com.company;

public class Main {

    public static void main(String[] args) {
	    //Toán tử số học trong Java
        int a = 20, b = 5;

        int tong = a + b;
        System.out.println(a + " + " + b + " = " + (a + b));

        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + (a - b));

        int tich = a * b;
        System.out.println(a + " * " + b + " = " + (a * b));

        int thuong = a / b;
        System.out.println(a + " / " + b + " = " + (a / b));

        int phanDu = a % b;
        System.out.println(a + " % " + b + " = " + (a % b));

        a++;
        b--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
