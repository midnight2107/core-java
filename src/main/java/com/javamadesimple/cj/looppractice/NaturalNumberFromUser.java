package com.javamadesimple.cj.looppractice;

import java.util.Scanner;

public class NaturalNumberFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        // 1 + 2 + 3 + 4 + 5 => 18
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i; // total = total + i;
        }
        System.out.println("The sum of "+num+" natural number is "+total);


    }
}
