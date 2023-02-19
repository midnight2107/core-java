package com.javamadesimple.cj.whilelooppractice;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int result = 1;
        while(i <= num) {
            result *= i;
            i++;
        }
        System.out.println("The factorial of " + num + " = " + result);
    }
}
