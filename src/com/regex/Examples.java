package com.regex;

public class Examples {
    public static void main(String[] args) {

        //Write 10-digit mobile number with regEx
        /*Rules:
        * 1. Each number should contain exactly 10 digits
        * 2. First digit should be 7/8 or 9
        * */
        String regEx = "[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
        String regEx2 ="[7-9][0-9]{9}";
        String regEx3 = "[789][0-9]{9}";

        //2. Mobile number must be either 10 or 11 digits
        //if it is 11 digits, the fist digit should be 0
        String regEx4 = "0?[7-9][0-9]{9}";

        //3. Mobile number should be either 10-11-12 digit
        //if 12 digits, the first 2 digits 91
        String regEx5 ="(0|91)?[7-9][0-9]{9}";

        /*======= To represent all mail IDs========*/
        // durga_ocjp.123@gmail.com
        String regExMail ="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z-0-9]+[.]([a-zA-Z]+)+";

        //if the requirement is to take gmail only
        String regExMail2 ="[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";

        //Regular expression to represent all Yava language identifiers
        String regExYava = "[a-k][0369][a-zA-Z0-9#$]*";

        //To represent all names starting with A/a
        String regExNames = "[aA][a-zA-Z]*";

        //To represent all names ending with L/l
        String regExEndingL = "[a-zA-Z]*[lL]";

        //To represent all names starting with 'a/A' and ends with 'L/l';
        String regExStaringAendingL = "[a-Z][a-zA-Z]*[lL]";
    }
}
