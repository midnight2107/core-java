package com.javamadesimple.cj.looppractice;

import java.util.Scanner;

public class OddNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int lower = 1;
        int ub = num;

        // 6 8 10
        // 5 7 9
        int esum = 0;
        int osum = 0;
        for (int i = lower; i <= ub; i++) {
            if(i % 2 == 0){
                esum += i;
            }else{
                osum += i;
            }
        }
        System.out.println("The odd numbers between 1 and " + num+ " are: " +osum);


    }
}

