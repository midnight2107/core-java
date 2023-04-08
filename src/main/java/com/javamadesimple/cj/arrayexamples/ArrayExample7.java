package com.javamadesimple.cj.arrayexamples;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            int num = ThreadLocalRandom.current().nextInt(10,100);
            arr[i] = num;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 10 - 99: ");
        int number = sc.nextInt();
        boolean isFound = false;
        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            if(value == number){
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("The number " + number + " is found in the array.");
        }
        else{
            System.out.println("The number " + number + " is not found in the array.");
            System.out.println("The elements are: " + Arrays.toString(arr));
        }

    }
}
