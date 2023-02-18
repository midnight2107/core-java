package com.javamadesimple.cj.assignment;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = sc.nextFloat();
        float cube = num1 * num1 * num1;
        System.out.println("The cube of the number is: " + cube );
    }
}
