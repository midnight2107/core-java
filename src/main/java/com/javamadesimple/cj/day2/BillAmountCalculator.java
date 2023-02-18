package com.javamadesimple.cj.day2;

import java.util.Scanner;

public class BillAmountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        float billAmount = sc.nextFloat();
        float discount = 0.0f;
        if(billAmount >= 500){
            discount = billAmount * 0.1f;
        }
        float netAmount = billAmount - discount;
        System.out.println("The bill amount is: " + billAmount );
        System.out.println("The discount is: " + discount);
        System.out.println("The net amount is: " + netAmount);
    }

}
