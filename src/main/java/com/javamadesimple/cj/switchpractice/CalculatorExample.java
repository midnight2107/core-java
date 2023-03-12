package com.javamadesimple.cj.switchpractice;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter another number: ");
        float num2 = sc.nextFloat();
        System.out.println("1. add 2. subtract 3. multiply 4. divide");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        float result = 0.0f;
        String operator = "";
        switch(choice) {
            case 1 : result = num1 + num2;
            operator = "+";
            break;
            case 2 : result = num1 - num2;
            operator = "-";
            break;
            case 3 : result = num1 * num2;
            operator = "*";
            break;
            case 4 : result = num1 / num2;
            operator = "/";
            break;
            default : operator = "invalid operator";
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
