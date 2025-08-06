package lab_02_Operator;

import java.util.Scanner;

public class HW_Prob04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String inputStr = scanner.nextLine();
        int lenInput = inputStr.length();

        int lastPos = lenInput;
        String outputStr = new String("");
        while (lastPos>0){
            String temp = inputStr.substring(lastPos-1,lastPos);
            outputStr = outputStr.concat(temp);
            lastPos--;
        }
        System.out.println(outputStr);
    }
}
