package com.streamliners.task0;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Class10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 4;
        double x1 = (-b+sqrt(pow(b,2)-(4*a*c)))/(2*a);
        double x2 = (-b-sqrt(pow(b,2)-(4*a*c)))/(2*a);
        System.out.println("Roots are "+x1+"&"+x2);
    }
}
