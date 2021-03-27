package com.streamliners.task0;


import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ar[]=st.toCharArray();
        System.out.println("The character whose frequency to find=");
        char a = sc.next().charAt(0);
        int n=0;
        for(int i=0;i<st.length();i++){
            if(ar[i]==a){
                n++;
            }
        }
        System.out.println("Frequency="+n);
    }
}
