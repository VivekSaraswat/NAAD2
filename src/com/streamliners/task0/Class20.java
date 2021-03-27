package com.streamliners.task0;

import java.util.Scanner;

public class Class20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a ;
        int num=0;
        while(n!=0){
            num++;
            n=n/10;
        }
        System.out.println(num);
    }
}
