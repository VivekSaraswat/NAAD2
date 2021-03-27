package com.streamliners.task0;

import java.util.Scanner;

public class Class12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ar[]=str.toCharArray();
        String str2="";
        int n=0 , i=0;
        while(i<str.length()){
            if(ar[i]==' '){
                str2=str2.concat(str.substring(n,i));
                n=i+1;
            }
            i++;
            if(i==str.length()){
                str2=str2.concat(str.substring(n,i));
            }
        }
        System.out.println(str2);
    }
}
