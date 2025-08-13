package lab_02_StringJavaRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegEx_textSearch {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("deal");
        Matcher matcher = pattern.matcher("Summer Sale, best deal 2025!! 10% discount");
        boolean found = matcher.find();
        System.out.println(found);
    }
}
