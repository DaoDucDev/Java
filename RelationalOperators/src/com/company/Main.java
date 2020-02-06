package com.company;

public class Main {

    public static void main(String[] args) {

        //Ví dụ về toán tử quan hệ ( ==, !=, >, <, >=, <= )
        int num1 = 12, num2 = 4;

        //Toán tử BẰNG, kiểm tra xem 2 toán hạng có bằng nhau hay không
        System.out.println("num1 == num2 = " + (num1 == num2) );

        //Toán tử KHÔNG BẰNG, kiểm tra xem 2 toán hạng có khác nhau hay không
        System.out.println("num1 != num2 = " + (num1 != num2) );

        //Toán tử LỚN HƠN, kiểm tra xem toán hạng bên trái có lớn hơn toán hạng bên phải không
        System.out.println("num1 >  num2 = " + (num1 >  num2) );

        //Toán tử NHỎ HƠN, kiểm tra xem toán hạng bên trái có nhọ hơn toán hạng bên phải không
        System.out.println("num1 <  num2 = " + (num1 <  num2) );

        //Toán tử LỚN HƠN HOẶC BẰNG, kiểm tra xem toán hạng bên trái có lớn hơn hoặc bằng toán hạng bên phải không
        System.out.println("num1 >= num2 = " + (num1 >= num2) );

        //Toán tử NHỎ HƠN HOẶC BẰNG, kiểm tra xem toán hạng bên trái có nhỏ hơn hoặc bằng toán hạng bên phải không
        System.out.println("num1 <= num2 = " + (num1 <= num2) );
    }
}
