package com.javamadesimple.cj.looppractice;

import java.util.Scanner;

public class DeterminePrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        // count the number of factors that the number has
        int factor = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factor++;
            }
        }
        if(factor == 2){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
}

