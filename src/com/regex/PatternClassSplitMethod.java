package com.regex;

import java.util.regex.Pattern;

public class PatternClassSplitMethod {

    public static void main(String[] args) {

        String durga = "Durga Software Solutions";
        Pattern pattern = Pattern.compile("\\s");
        String[] split = pattern.split(durga);
        for (String s : split){
            System.out.println(s);
        }

    }
}
