package com.streamliners.task0;

public class Class26 {
    public static void main(String[] args) {
        /* Pattern 1
                   12
                   123
                   1234
                   12345
         */
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j<=i){
                    System.out.print(j+1);
                }
            }
            System.out.println();
        }
    }
}
