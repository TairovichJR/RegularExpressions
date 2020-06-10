package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

    public static void main(String[] args) {

        //Create a pattern object with compile method
        Pattern p = Pattern.compile("ab"); // pattern object, what to search
        Matcher m = p.matcher("ababbaba"); //target String, where we want to search
        int count = 0;

        while(m.find()){
            count++;
            //     start()-> starting index   end() ending index
            System.out.println(m.start() + " " + m.end()+  " " + m.group());
        }

        System.out.println("Number of occurences of ab: " + count);

        String pattern = "[^0-9]";
        Pattern p1 = Pattern.compile(pattern);
        Matcher m1 = p1.matcher("a7b@2#9x");
        while (m1.find()){
            System.out.println(m1.start() + "..." + m1.end() + "..." + m1.group());
        }

        String x = "aa?";
        Pattern p2 = Pattern.compile(x);
        Matcher m2 = p1.matcher("abbaabbaaa");
        int count1 = 0;
        while (m1.find()){
            count1++;
            System.out.println(m1.start() + " " + m1.group());
        }

        System.out.println("occurences of a " + count);
    }
}
