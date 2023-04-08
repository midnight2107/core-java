package com.javamadesimple.cj.arrayexamples;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int ele: numArr){
            sum = sum + ele;
        }
        System.out.println("The sum is: " + sum);
    }
}
