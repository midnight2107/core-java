package com.javamadesimple.cj.assignment;

import java.util.Scanner;

public class SumAverageTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter a number: ");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        float average = sum / 2;
        System.out.println("The sum of the numbers is: " + sum + " and the average is: " + average);

    }
}
