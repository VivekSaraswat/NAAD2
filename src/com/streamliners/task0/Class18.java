package com.streamliners.task0;

public class Class18 {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 1 ;
        int c ;
        int n=10;
        System.out.println(a);
        System.out.println(b);
        while(n>0){
            c = a+b;
            System.out.println(c);
            a = b ;
            b = c ;
            n--;
        }
    }
}
