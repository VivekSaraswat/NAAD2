package com.streamliners.task0;

import java.util.Scanner;

public class Class17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (int)a;
        if((b>64 && b<91) || (b>96 && b<123)){
            System.out.println(a + " is alphabet");
        }
        else{
            System.out.println(a + " is not alphabet");
        }

    }
}
