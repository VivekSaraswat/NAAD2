package com.streamliners.task2;

import java.util.ArrayList;
import java.util.List;

public class SubTask1 {

    public static void main(String[] args) {
        System.out.println(getList("1;2;3;4"));
    }

    private static List<Integer> getList(String s) {
        //Write your code here!
        String s1 = s.replaceAll(";","");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i< s1.length() ;i++){
            list.add(Integer.valueOf(s1.charAt(i))-48);
        }

        return list;
    }

}
