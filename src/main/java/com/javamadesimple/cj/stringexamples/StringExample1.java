package com.javamadesimple.cj.stringexamples;

public class StringExample1 {
    public static void main(String[] args) {
        String name = "Death On the Nile";
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
        System.out.println("-".repeat(50));
        for(int i = name.length() - 1; i >= 0; i--){
            System.out.println(name.charAt(i));
        }

    }
}
