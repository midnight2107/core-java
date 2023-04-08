package com.javamadesimple.cj.stringexamples;

public class StringExample4 {
    public static void main(String[] args) {
        String data = "Manya- Gowri-Ansh-  Srikar-Ruhi -Pranatee-Sahana";
        String[] arr = data.split("-");
        for(String name : arr){
            System.out.println(name.trim().toUpperCase().substring(0,3));
        }
    }
}
