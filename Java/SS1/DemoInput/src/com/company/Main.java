package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // Khai báo đối tượng của lớp Scanner để nhận dữ liệu đầu vào
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("Bạn đã nhập chuỗi " + s);

        int a = in.nextInt();
        System.out.println("Bạn đã nhập số nguyên " + a);

        float b = in.nextFloat();
        System.out.println("Bạn đã nhập số thực " + b);
    }
}
