package com.javamadesimple.cj.nestedloops;

public class PrintTables {
    public static void main(String[] args) {
        for(int k = 1; k <= 20;k++) {
            int num = k;
            for(int i = 1; i <= 10; i++){
                System.out.println(num + " * " + i + " = " + num * i);
            }
            System.out.println("-".repeat(20));
        }
    }
}
