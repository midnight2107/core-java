package com.javamadesimple.cj.day1;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 15;
        System.out.println("Before the swap num1 = " + num1 + " num2 = " + num2 );
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After the swap num1 = " + num1 + " num2 = " + num2 );
    }
}
