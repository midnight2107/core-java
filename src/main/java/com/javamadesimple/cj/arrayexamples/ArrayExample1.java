package com.javamadesimple.cj.arrayexamples;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] numArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
        for (int i = numArr.length - 1; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
        for (int i: numArr){
            System.out.print(i + " ");
        }
    }
}
