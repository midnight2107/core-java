package com.javamadesimple.cj.ifpractice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float number = sc.nextFloat();
        if(number % 2 == 0) {
            System.out.println( number + " is even.");
        } else{
            System.out.println( number + " is odd.");
        }
    }
}
