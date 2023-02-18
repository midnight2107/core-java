package com.javamadesimple.cj.ifpractice;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original price: ");
        float originalPrice = sc.nextFloat();
        System.out.println("Enter the selling price: ");
        float sellingPrice = sc.nextFloat();
        if(sellingPrice > originalPrice){
            System.out.println("You made a profit!");
        } else{
                System.out.println("You made a loss.");
            }
        }
    }

