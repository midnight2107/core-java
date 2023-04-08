package com.javamadesimple.cj.stringexamples;

public class StringExample2 {
    public static void main(String[] args) {
        String[] arr = new String [] {"Manya", "Pranatee", "Shriya", "Anagha", "Tanya"};
        for(int i = 0; i < arr.length; i++){
            String name = arr[i];
            System.out.println(name.substring(0,3).toUpperCase());
            System.out.println(name.substring(name.length() - 3));
        }

    }
}
