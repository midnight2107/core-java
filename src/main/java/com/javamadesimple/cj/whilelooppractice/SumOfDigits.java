package com.javamadesimple.cj.whilelooppractice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            int r = num % 10;
            sum+= r;
            num = num/10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
