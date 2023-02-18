package com.javamadesimple.cj.ifpractice;

import java.util.Scanner;

public class BillAgeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        System.out.println("Enter your age: ");
        float billAmount = sc.nextFloat();
        float discount = 0.0f;
        float age = sc.nextFloat();
        if(age > 50){
            discount = billAmount * 0.05f;
        }
        float netAmount = billAmount - discount;
        System.out.println("The bill amount is: " + billAmount + " and the discount is: " + discount + " and the net amount is: " + netAmount);

    }
}
