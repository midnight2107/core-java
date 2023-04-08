package com.javamadesimple.cj.arrayexamples;

import java.util.Arrays;

public class ArrayExample8 {
    public static void main(String[] args) {
        String[] arr = new String [] {"Manya", "Rathna", "Murali", "Rathna", "Manya", "Shravya"};
        boolean isPalindrome = true;
        for(int i = 0, j = arr.length - 1; i <= j; i++, j--){
            if(arr[i] != arr[j]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(Arrays.toString(arr) + " is a palindrome.");
        }
        else{
            System.out.println(Arrays.toString(arr) + " is not a palindrome.");
        }
    }
}
