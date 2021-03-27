package com.streamliners.task0;

import java.util.Scanner;

public class Class22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a ;
        int l ;
        int rev=0;
        while(n!=0){
            l=n%10;
            rev=(rev*10)+l;
            n=n/10;
        }
        if(a==rev) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
