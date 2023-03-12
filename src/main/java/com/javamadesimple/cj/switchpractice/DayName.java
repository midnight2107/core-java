package com.javamadesimple.cj.switchpractice;

import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int day = sc.nextInt();
        String dayName = "";
        switch(day){
            case 1 : dayName = "Monday";
                break;
            case 2 : dayName = "Tuesday";
            break;
            case 3 : dayName = "Wednesday";
            break;
            case 4 : dayName = "Thursday";
            break;
            case 5 : dayName = "Friday";
            break;
            case 6 : dayName = "Saturday";
            break;
            case 7 : dayName = "Sunday";
            break;
            default : dayName = "invalid day number entered";
            break;
        }
        System.out.println("The day name is: " + dayName);
    }
}
