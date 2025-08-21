package lab_06_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab_61 {

    public static void main(String[] args) {
        String input = "2hrs and 5 minutes";

        //split strings hour, minute
        String[] inputSplited = input.split("and");
        String hours = inputSplited[0].replaceAll("[^0-9]","");
        String mins = inputSplited[1].replaceAll("[^0-9]","");

        //create patter to get value of hour, minute
        int totalMins = Integer.valueOf(hours)*60 + Integer.valueOf(mins);
        System.out.println("Total in minutes: " + totalMins);

    }
}
