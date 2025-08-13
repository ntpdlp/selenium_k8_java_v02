package lab_06_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab_62 {

    public static void main(String[] args) {

        String myStr = "100 minutes";
        Pattern pattern = Pattern.compile("[^0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(myStr);
        String output = matcher.replaceAll("");

    }
}
