package com.streamliners.task0;

import java.util.Scanner;

public class Class23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition=1 Subtraction=2 Multiplication=3 Division=4");
        int n = sc.nextInt();
        switch(n) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println((a / b));
                break;
            default:
                System.out.println("Wrong Operation");
        }
    }
}
