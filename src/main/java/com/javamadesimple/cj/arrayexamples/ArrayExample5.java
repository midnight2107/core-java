package com.javamadesimple.cj.arrayexamples;

public class ArrayExample5 {
    public static void main(String[] args) {
        String[] names = {"Manya", "Shriya", "Anagha", "Ruhi", "Pranatee", "Tanya"};
        System.out.println(names.length);
        System.out.println(names[2]);
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("-".repeat(50));
        for (int i = names.length - 1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }

}


