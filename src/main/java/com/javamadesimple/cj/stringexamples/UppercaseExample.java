package com.javamadesimple.cj.stringexamples;

public class UppercaseExample {
    public static void main(String[] args) {
        String names = "Manya, Pranatee, Shriya, Gowri, Anushka, Rhea";
        String[] data = names.split(",");
        for (String name : data) {
            System.out.println(name.trim().toUpperCase().substring(0,1));
        }
    }
}
