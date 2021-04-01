package com.streamliners.task1;

public class SubTask2 {

    public static void main(String[] args) {
        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }

    private static int totalWeight(String s, int[] weights) {
        //Write your code here!
        char arr[]= s.toCharArray();
        int sum=0;
        for(int i=0 ; i<s.length() ; i++){
            int j = ((int)arr[i])-65;
            sum+=weights[j];
        }
        System.out.println(sum);

        return 0;
    }

}
