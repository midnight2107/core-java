package com.javamadesimple.cj.arrayexamples;

import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            arr[i] = number;
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        float average = sum / (float)arr.length;
        System.out.println("The sum is: " + sum + " and the average is: " + average);
    }

}
