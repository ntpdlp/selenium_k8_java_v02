package lab_02_Operator;

public class lab02_JavaStringUserInputHandling {

    public static void main(String[] args) {
        //get from UI , user's input including number+char
        //Problem: how to get value only to calculate?
        String userInput = "150mins";
        String value = userInput.replaceAll("[^0-9]",""); //150 (tru so 0..9 ra, con lai remove)
        int rawValue = Integer.valueOf(value);
        System.out.println("Cooking time is: " + (rawValue+1));

        String testing = "123456adjfla5964646";
        String testingRep = testing.replaceAll("[^0-9]","");
        System.out.println(testingRep);

        //Advance: Matcher, Pattern
    }
}
