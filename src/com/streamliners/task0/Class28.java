package com.streamliners.task0;

public class Class28 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8};
        int len = a.length+b.length;
        int c[]=new int [len];
        int pos=0;
        for( int element : a){
            c[pos]=element;
            pos++;
        }
        for (int element : b){
            c[pos]=element;
            pos++;
        }
        for (int ele : c){
            System.out.print(ele+" ");
        }
    }
}
