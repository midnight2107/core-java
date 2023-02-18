package com.javamadesimple.cj.day1;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of person 1:");
        int weight1 = sc.nextInt();
        System.out.println("Enter weight of person 2:");
        int weight2 = sc.nextInt();
        System.out.println("Enter weight of person 3:");
        int weight3 = sc.nextInt();
        int sum = weight1 + weight2 + weight3;
        float average = sum / 3.0f;
        System.out.println("The sum of the weights is = " + sum + " and average is = " + average );

    }
}
