package com.javamadesimple.cj.looppractice;

import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            int m = num % 10;
            sum+= m;
            num = num/10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
