package com.streamliners.task0;

public class Class31 {
    public static void main(String[] args) {
        String s1 = "123";
        try{
            int a =Integer.valueOf(s1);
        } catch (Exception e){
            System.out.println("String is not Numeric");
            return ;
        }
        System.out.println("String is Numeric");
        return ;
    }
}
