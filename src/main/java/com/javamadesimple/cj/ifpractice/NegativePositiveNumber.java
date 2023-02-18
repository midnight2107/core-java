package com.javamadesimple.cj.ifpractice;

import java.util.Scanner;

public class NegativePositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float number = sc.nextFloat();
        if (number < 0) {
            number = -number;
        }
        System.out.println("The number is: " + number);
    }
}
