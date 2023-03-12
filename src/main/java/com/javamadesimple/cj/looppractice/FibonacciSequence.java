package com.javamadesimple.cj.looppractice;

public class FibonacciSequence {
    public static void main(String[] args) {
        int num = 34;
        int a = 0;
        int b = 1;
        while (a <= num){
            System.out.print(" " + a);
            int sum = a + b;
            a = b;
            b = sum;

        }

    }
}
