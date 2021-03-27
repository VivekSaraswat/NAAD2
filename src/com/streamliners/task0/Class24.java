package com.streamliners.task0;

import java.util.Scanner;

public class Class24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ar[]= str.toCharArray();
        int numv=0;
        int numc=0;
        for(int i=0;i<str.length();i++){
            int p =(int)ar[i];
            if((p>=65 && p<=90) || (p>=97 && p<=122)){
                if(ar[i]=='a' || ar[i]=='e' ||ar[i]=='i' ||ar[i]=='o' ||ar[i]=='u' ||ar[i]=='A' ||ar[i]=='E' ||ar[i]=='I' ||ar[i]=='O' ||ar[i]=='U'){
                    numv++;
                }
                else{
                    numc++;
                }
            }
        }
        System.out.println("Number of vowels="+numv+" Number of consonants="+numc);

    }
}
