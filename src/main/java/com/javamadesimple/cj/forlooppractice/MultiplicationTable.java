package com.javamadesimple.cj.forlooppractice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 20; i >= 1; i--){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
