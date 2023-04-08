package com.javamadesimple.cj.arrayexamples;

import java.util.Scanner;

public class ArrayExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int[] numArr = new int[n];
        for (int i = 0; i < numArr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " value");
            numArr[i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int num : numArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int biggest = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (biggest < numArr[i]) {
                biggest = numArr[i];
            }
        }
        System.out.println("The biggest value is: " + biggest);

        int smallest = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (smallest > numArr[i]) {
                smallest = numArr[i];
            }
        }
        System.out.println("The smallest value is: " + smallest);
    }
}
