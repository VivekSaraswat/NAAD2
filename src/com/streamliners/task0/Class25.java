package com.streamliners.task0;

public class Class25 {
    public static void main(String[] args) {
        String a[]={"Car","Apple","Boy","Ball","Cat"};
        for(int i=0 ; i<a.length ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i].compareTo(a[j])>0){
                    String temp ;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for(String str:a) {
            System.out.println(str);
        }
    }
}
