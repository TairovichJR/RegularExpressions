package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberIdentifierDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your number: ");
        long number = scanner.nextLong();

        String regEx = "(0|91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(String.valueOf(number));

        if (matcher.find() && matcher.group().equalsIgnoreCase(String.valueOf(number))){
            System.out.println("The number you have provided is valid: " + matcher.group());
        }else{
            System.out.println("Invalid number");
        }

    }
}
