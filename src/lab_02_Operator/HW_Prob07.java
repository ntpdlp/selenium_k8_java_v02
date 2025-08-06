package lab_02_Operator;

import java.util.Scanner;
import java.util.StringJoiner;

public class HW_Prob07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string inputs, seperate by a comma: ");
        String inputStr = scanner.next();

        String[] inputSplitStrs = inputStr.split(",");
        StringJoiner sj = new StringJoiner(",","[","]");
        for (String string : inputSplitStrs) {
            System.out.println(string);
            if(string.startsWith("A") || string.startsWith("a")){
                sj.add(string);
            }
        }

        //print output
        System.out.println(sj);
    }
}
