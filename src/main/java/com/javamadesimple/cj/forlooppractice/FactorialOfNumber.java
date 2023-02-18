package com.javamadesimple.cj.forlooppractice;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println("The factorial of the number is: " + result);
    }
}
