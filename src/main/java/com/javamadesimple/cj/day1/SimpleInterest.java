package com.javamadesimple.cj.day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        float principalAmount = sc.nextFloat();
        System.out.println("Enter the time in years:");
        float time = sc.nextFloat();
        System.out.println("Enter the rate of interest in percentage:");
        float rateOfInterest = sc.nextFloat();
        // (P*T*R)/100
        float si = (principalAmount * time * rateOfInterest) / 100;
        System.out.println("The simple interest is = " + si );



    }
}
