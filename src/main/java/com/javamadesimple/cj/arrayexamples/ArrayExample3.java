package com.javamadesimple.cj.arrayexamples;

import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[]  names = new String[n];
        for(int i = 0; i < names.length; i++){
            System.out.println("Enter the " + (i + 1) + " name");
            names[i] = sc.nextLine();
        }
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("Reverse order: ");
        for(int i = names.length - 1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }
}
