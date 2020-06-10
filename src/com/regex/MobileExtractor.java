package com.regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExtractor {

    public static void main(String[] args) throws IOException {

        //Write a program to extract mobile numbers from input .txt file
        //where mobile numbers are mixed with normal text
        String reg = "([a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z-0-9]+[.]([a-zA-Z]+)+|(0|91)?[7-9][0-9]{9})";
        Pattern p = Pattern.compile(reg);
        Matcher m = null;

        PrintWriter printWriter = new PrintWriter("output.txt");
        BufferedReader rd = new BufferedReader(new FileReader("input.txt"));
        String line ="";
        while((line = rd.readLine()) != null){
            m = p.matcher(line);
            while(m.find()){
                printWriter.println(m.group());
            }
        }
        printWriter.flush();
        printWriter.close();
        rd.close();
    }
}
