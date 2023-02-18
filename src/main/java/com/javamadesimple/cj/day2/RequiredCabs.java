package com.javamadesimple.cj.day2;

import java.util.Scanner;

public class RequiredCabs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people? ");
        int numberOfPeople = sc.nextInt();
        System.out.println("What is the cab capacity? ");
        int cabCapacity = sc.nextInt();
        int requiredCabs = 0;
        if (numberOfPeople % cabCapacity != 0) {
            requiredCabs = (numberOfPeople / cabCapacity) + 1;
        } else {
            requiredCabs = numberOfPeople / cabCapacity;
        }
        System.out.println("For " + numberOfPeople + " people, with the capacity of " + cabCapacity + " you need " + requiredCabs + " cabs.");
    }
}
