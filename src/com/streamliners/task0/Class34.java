package com.streamliners.task0;

public class Class34 {
    public static void main(String[] args) {
        String s1 = "this is vivek saraswat";
        char ar[] = s1.toCharArray();
        ar[0]-=32;
        for(int i=0;i<s1.length();i++){
            if(ar[i]==' '){
                ar[i+1]-=32;
            }
        }
        System.out.println(ar);
    }
}
