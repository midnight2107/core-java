package com.javamadesimple.cj.stringexamples;

public class PalindromeExample {
    public static void main(String[] args) {
        String data = "kayak";
        boolean isPalindrome = false;
        for(int i = 0, j = data.length() - 1; i <= j; i++, j-- ){
            if(data.charAt(i) != data.charAt(j)){
                isPalindrome = true;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("This string: " + data + " is not a palindrome.");
        }
        else{
            System.out.println("This string: " + data + " is a palindrome.");
        }
    }
}
