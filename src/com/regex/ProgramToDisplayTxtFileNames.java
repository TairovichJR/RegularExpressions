package com.regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramToDisplayTxtFileNames {

    public static void main(String[] args) {

        String reg = "[a-zA-Z0-9][a-zA-Z0-9$_.]*[.]java";
        Pattern p = Pattern.compile(reg);

        File files = new File("C:\\Users\\14128\\Downloads");
        String[] s = files.list();
        for (String s1 : s){
            Matcher m = p.matcher(s1);
            if (m.find() && m.group().equalsIgnoreCase(s1)){
                System.out.println(s1);
            }
        }
    }
}
