package com.javamadesimple.cj.assignment;

import java.util.Scanner;

public class NumberSwapPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter another number: ");
        float num2 = sc.nextFloat();
        System.out.println("Before the swap num1 = " + num1 + " and num2 = " + num2 );
        float temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After the swap num1 = " + num1 + " and num2 = " + num2 );


    }
}
