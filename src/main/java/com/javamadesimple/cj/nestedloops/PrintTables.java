package com.javamadesimple.cj.nestedloops;

public class PrintTables {
    public static void main(String[] args) {
        for(int i = 1; i <= 20;i++) {
            int num = i;
            for(int k = 1; k <= 10; k++){
                System.out.println(num + " * " + k + " = " + num * k);
            }
            System.out.println("-".repeat(20));
        }
    }
}
