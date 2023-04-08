package com.javamadesimple.cj.stringexamples;

public class StringExample3 {
    public static void main(String[] args) {
        String data = "racecar!";
        boolean isPalindrome = true;
        for(int i = 0, j = data.length() - 1; i <= j; i++, j-- ){
            if(data.charAt(i) != data.charAt(j)){
                isPalindrome = false;
                break;
            }
        }
       if(isPalindrome){
           System.out.println("This string: " + data + " is a palindrome.");
       }
       else{
           System.out.println("This string: " + data + " is not a palindrome.");
       }
    }
}
