package com.javamadesimple.cj.day2;

import java.util.Scanner;

public class NegativeAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age < 0) {
          age = -age;
        }
        System.out.println("The age is: " + age);
    }
}
