package com.javamadesimple.cj.assignment;

import java.util.Scanner;

public class SimpleInterestPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount: ");
        float principalAmount = sc.nextFloat();
        System.out.println("enter the time in years: ");
        float time = sc.nextFloat();
        System.out.println("enter the rate of interest in percentage: ");
        float interestRate = sc.nextFloat();
        // (P*T*R)/100
        float simpleInterest = (principalAmount * time * interestRate) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
