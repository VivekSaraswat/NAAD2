package com.streamliners.task2;

import java.util.HashMap;

public class SubTask2 {

    public static void main(String[] args) {
        System.out.println(getOccurrencesHashMap("1;2;2;2;3;1"));
    }

    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        //Write your code here!
        String s1 = s.replaceAll(";","");
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0 ; i < s1.length() ; i++ ){
            int sum = 1;
           for(int j=i+1 ; j< s1.length() ; j++) {
               if (s1.charAt(j) == s1.charAt(i)) {
                   sum++;
               }
           }
               if(map.containsKey(Integer.valueOf(s1.charAt(i)-48))){
               }
               else{
               map.put(Integer.valueOf(s1.charAt(i)-48),sum);}

        }

        return map;
    }

}
