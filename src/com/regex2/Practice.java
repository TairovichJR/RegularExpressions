package com.regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {
        //Challenge 1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("^I want a bike."));

        //Challenge 2
        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regExp));

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));


        //Challenge 3
        String regExp2 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp2);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        //Challenge 4
        String challenge4 = "Replace all blanks with underscores";
        System.out.println(challenge4.replaceAll("\\s","_"));

        //Challenge 5
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$","REPLACED"));

        //Challenge 7
        String reg = "^[a-z]+\\.\\d+$";
        System.out.println("abcd.1235".matches(reg));

    }
}
