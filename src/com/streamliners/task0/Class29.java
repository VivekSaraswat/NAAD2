package com.streamliners.task0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Class29 {
    public static void main(String[] args) throws ParseException {
        String Date1 = "30/03/2021";
        Date Date2 = new SimpleDateFormat("dd/MM/yyyy").parse(Date1);
        System.out.println(Date2);
    }
}
