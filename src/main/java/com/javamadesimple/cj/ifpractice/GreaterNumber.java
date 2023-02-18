package com.javamadesimple.cj.ifpractice;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter another number: ");
        float num2 = sc.nextFloat();
        if(num1 > num2){
            System.out.println(num1 + " is greater.");
        } else {
            System.out.println(num2 + " is greater.");
        }
    }
    }
