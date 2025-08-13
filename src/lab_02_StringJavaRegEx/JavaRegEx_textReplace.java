package lab_02_StringJavaRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * -Regular Expression is a sequence of characters that performs a search pattern.
 * -Regular Expression can perform all kind of 'text search' and 'text replace' operations
 * -Java doesn't have built-in RegEx class, but we can import the java.util.regex package to work with RegEx.
 *  Package includes these classes:
 *      Pattern class: define a pattern
 *      Matcher class: used to search for the pattern
 *      PatternSyntaxException class: indicate syntax error in the RegEx pattern
 */

public class JavaRegEx_textReplace {

    public static void main(String[] args) {

        /*
        Ngu canh 1: want to get value from user input with String method
        BASIC
         */
        String userInput = "150mins"; //e.g cookingTime

        String userValueFilter01 = userInput.replaceAll("[a-z|A-Z]",""); //remove tat ca ky tu a-z or A-Z.
        System.out.println(userValueFilter01); //150

        String userValueFilter02 = userInput.replaceAll("[^0-9]",""); //tru so tu range 0-9, con lai replace rong.
        System.out.println(userValueFilter02); //150


        /*
        Ngu canh 2: Su dung Java Regular Expression
        ADVANCED
         */
        Pattern pattern = Pattern.compile("[^0-9]",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("150mins");
        String userValueFilter03 = matcher.replaceAll("");
        System.out.println(userValueFilter03);

    }
}
