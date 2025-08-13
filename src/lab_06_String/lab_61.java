package lab_06_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab_61 {

    public static void main(String[] args) {
        String input = "2hrs and 5 minutes";

        Pattern pattern = Pattern.compile("[^0-9]",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        String output = matcher.replaceAll("");
        String hours = output.substring(0,1);
        String mins = output.substring(1,2);
        System.out.println(hours);
        System.out.println(mins);
        int totalMins = Integer.valueOf(hours)*60 + Integer.valueOf(mins);
        System.out.println("Total in minutes: " + totalMins);

    }
}
