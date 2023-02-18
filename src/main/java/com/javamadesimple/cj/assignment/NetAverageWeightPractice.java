package com.javamadesimple.cj.assignment;

import java.util.Scanner;

public class NetAverageWeightPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the first person: ");
        float weight1 = sc.nextFloat();
        System.out.println("Enter the weight of the second person: ");
        float weight2 = sc.nextFloat();
        System.out.println("Enter the weight of the third person: ");
        float weight3 = sc.nextFloat();
        System.out.println("Enter the weight of the fourth person: ");
        float weight4 = sc.nextFloat();
        System.out.println("Enter the weight of the fifth person: ");
        float weight5 = sc.nextFloat();
        float sum = weight1 + weight2 + weight3 + weight4 + weight5;
        float average = sum / 5;
        System.out.println("The net weight is: " + sum + " and the average weight is: " + average );
    }
}
