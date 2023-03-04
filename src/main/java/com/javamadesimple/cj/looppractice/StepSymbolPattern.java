package com.javamadesimple.cj.looppractice;

public class StepSymbolPattern {
    public static void main(String[] args) {
        float p = 10;
        for (float i = 1; i <= p; i++) {

            for (float k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }

        for (float i = p; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
