package com.javamadesimple.cj.nestedloops;

public class PrintTables {
    public static void main(String[] args) {
        for(int i = 1; i <= 100;i++) {
            int num = i;
            for(int k = 1; k <= 10; k++){
                System.out.println(num + " * " + k + " = " + num * k);
            }
            System.out.println("-".repeat(20));
        }
        System.out.println(biggest(20, 30, 40));
    }


    public static int biggest(int a, int b, int c) {
        int big;
        if (a > b && a > c) {
            big = a;
        } else if (b > c) {
            big = b;
        } else {
            big = c;
        }
        return big;
    }

}
