package com.streamliners.task0;


import java.util.Arrays;


public class Class32 {
    public static void main(String[] args) {
        String str1 = "Silent Heart";
        String str2 = "Listen Earth";
        String s1 = str1.replaceAll("\\s","");
        String s2 = str2.replaceAll("\\s","");
        Boolean flag = true ;
        if (s1.length()!=s2.length()){
            flag = false;
        }
        else {
            char ar1[]= s1.toLowerCase().toCharArray();
            char ar2[]= s2.toLowerCase().toCharArray();
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            flag = Arrays.equals(ar1,ar2);
        }
        if(flag){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
