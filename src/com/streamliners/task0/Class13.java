package com.streamliners.task0;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Class13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        int n =sc.nextInt();
        double d2 = Math.round(d1*pow(10,n))/pow(10,n);
        System.out.println(d2);
    }
}
