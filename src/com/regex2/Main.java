package com.regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String string = "I am a string. Yes, I am";
        System.out.println(string);
        String yourString = string.replace("I","You");
        System.out.println(yourString);

        String alphanumeric ="abcDeeeF12Ghhiiijkl99z";
        // . means all the character, meaning everything
        System.out.println(alphanumeric.replaceAll(".","Y"));

        //meaning any string that starts with abcDeee
        System.out.println(alphanumeric.replaceAll("^abcDee","YYY"));

        String secondString ="abcDeeeF12GhhiiijkabcDeeel99z";
        //This time second occurrence of abcDeee in the middle of the String wont be replaced, as
        // ^ means only the starting
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        //returns if the string matches what is the regex
        System.out.println(alphanumeric.matches("^hello"));

        //Even though abcDee appears in teh String, in order for matches to return true,
        //the whole String must match
        System.out.println(alphanumeric.matches("^abcDeee"));

        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiijkl99z"));

        // $ is the opposite of ^ meaning it checks whether String ends with that expression
        System.out.println(alphanumeric.replaceAll("99z$","THE END"));

        // [aei] meaning replace all occurrences of a, e, i and 9 with the second parameter which is X
        System.out.println(alphanumeric.replaceAll("[a9ei]","X"));

        // replace if [a, e, i] is followed by F or j
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));

        // whether Capital H or lowercase h, replace the whole thing with Harry
        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        //to replace every leter except e and j
        String newAlpanumberic = "abcDeeeF12Ghhiiijkl99z";
        // ^ symbol inside [] means a different thing: means all chars except e and j
        System.out.println(newAlpanumberic.replaceAll("[^ej]","X"));

        //reg exp are case sensitive meaning here f wont be replaced because its in capital in String
        System.out.println(newAlpanumberic.replaceAll("[abcdef345678]","X"));

        System.out.println(newAlpanumberic.replaceAll("[a-f3-8]","X"));

        System.out.println(newAlpanumberic.replaceAll("(?i)[a-f3-8]","X"));

        System.out.println(newAlpanumberic.replaceAll("[0-9]","X")); //replaces all digits
        System.out.println(newAlpanumberic.replaceAll("\\d","X")); //replaces all digits too

        System.out.println(newAlpanumberic.replaceAll("\\D","X")); //replaces non-digits i.e letters

        String hasWhiteSpaces = "I have blanks and \t a tab, and also a new line\n";
        System.out.println(hasWhiteSpaces);

        System.out.println(hasWhiteSpaces.replaceAll("\\s","")); //removes all spaces
        System.out.println(hasWhiteSpaces.replaceAll("\t","X"));
        System.out.println(hasWhiteSpaces.replaceAll("\\S",""));


        String thirdString = "abceeeDF12GhhiiijkabcDeeel99z";
        System.out.println(thirdString.replaceAll("^abcDe{3}","YYY"));
        System.out.println(thirdString.replaceAll("^abcDe+","YYY"));
        System.out.println(thirdString.replaceAll("^abcDe*","YYY"));

        System.out.println(thirdString.replaceAll("^abcDe{2,5}","YYY")); //number of e between 2 and 5


        StringBuilder htmlText = new StringBuilder("<h1> My heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<p>This is another paragraph about something else</p/>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("Here is the summary</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        System.out.println();

        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

    }
}