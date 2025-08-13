package lab_06_String;

import java.util.HashMap;
import java.util.Scanner;

public class lab_64 {

    public static void main(String[] args) {

        //1. receive input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = scanner.nextLine().trim();

        //2.split by using delimeters: \\s space
        String regex ="[,?!\\s]";
        //String userInput = "hello, tui ten teo!!, ban ten gi?";
        String[] splited = userInput.split(regex);

        //3.create hashmap to calculate output e.g. ("hello":2), ("toi":1)...
        HashMap<String,Integer> wordCounts = new HashMap<>();
        for (int item = 0; item < splited.length; item++) {
            String currentStr = splited[item];
            if(!wordCounts.containsKey(currentStr) && !currentStr.equals("")){
                wordCounts.put(currentStr,Integer.valueOf(1));
            }else if (wordCounts.containsKey(currentStr)){
                Integer currentVal = wordCounts.get(currentStr);
                wordCounts.put(currentStr,Integer.valueOf(currentVal.intValue()+1));

            }
        }

        //4.in hashmap
        for (String s : wordCounts.keySet()) {
            System.out.println(s + ": " + wordCounts.get(s));
        }


    }
}
