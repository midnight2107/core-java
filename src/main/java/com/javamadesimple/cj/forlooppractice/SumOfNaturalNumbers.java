package com.javamadesimple.cj.forlooppractice;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++ ){
            result += i;
        }
        System.out.println("The sum of " + n + " natural numbers is: " + result);
    }
}
