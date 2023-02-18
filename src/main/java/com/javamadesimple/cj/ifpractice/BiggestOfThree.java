package com.javamadesimple.cj.ifpractice;

import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter another number: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter a third number: ");
        float num3 = sc.nextFloat();
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is largest.");
        } else if(num2 > num3) {
            System.out.println(num2 + " is largest.");
        } else {
            System.out.println(num3 + " is largest.");
        }
    }
}
