package com.javamadesimple.cj.looppractice;

import java.util.Scanner;

public class PrintFactorialFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int factorial = 1;
        while(i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + num + " = " + factorial);
    }
}
