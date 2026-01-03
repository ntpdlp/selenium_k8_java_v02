package lab_02_Operator;

import java.util.Date;
import java.util.StringJoiner;

public class lab02_JavaStringOperator {

    public static void main(String[] args) {
        //basic operators
        System.out.println("hello".charAt(2)); //l
        System.out.println("hello".charAt(20)); //Exception StringIndexOutOfBoundsException
        System.out.println("hello".indexOf('l'));  //2
        System.out.println("hello".indexOf('9'));  //-1
        System.out.println("hello".lastIndexOf('l'));  //3
        System.out.println("hello".substring(2, 4));  //ll
        System.out.println("hello".substring(10, 20));  //Exception StringIndexOutOfBoundsException

        System.out.println("hello".startsWith("he")); //true
        System.out.println("hello".startsWith("App")); //false
        System.out.println("hello world".endsWith("world")); //true
        System.out.println("hello world".endsWith("NOT")); //false

        System.out.println("Robert".equals("Robert")); //true
        System.out.println("Robert".equals("Mike")); //false
        System.out.println("Robert".equalsIgnoreCase("roBERT")); //true
        System.out.println("hello word".contains("wor"));  //true
        System.out.println("hello word".contains("baba"));  //false
        System.out.println("a".compareTo("z"));//-25
        System.out.println("z".compareTo("a"));//25

        //compare 2 strings in Java
        //since a String variable does not hold a String value, it holds a reference to the instance of String
        String s1 = "I love Java";
        String s2 = "I";
        s2 = s2.concat(" love Java"); //String Concatenation
        System.out.println(s1 == s2); //false >> equals() && hashCode()
        System.out.println(s1.equals(s2)); //true

        //String Joiner
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("Banana").add("Apple").add("Mango"); //required java.lang.CharSequence
        System.out.println(sj.toString());

        //Format Console Output
        System.out.printf("%.2f\n", 1955.555698432f);  //1955.55
        System.out.printf("%,10.2f\n", 1955.555698432f);//   1,955.55
        System.out.printf("%10.0f\n", 1955.55f);//   1956  (no decimal digits)

        String today01 = String.format("Today is %tD", new Date()); //Today is 07/28/25
        String today03 = String.format("Today is %tc", new Date()); //Today is Mon Jul 28 16:28:16 PDT 2025
        System.out.println(today01);
        System.out.println(today03);

        //split(), if using multiple separators then using a pipe | between them, use \\ before dot.
        String[] outputStrs = "hello,strings can be fun. They have many uses.".split(" |,|\\.");
        for (String item : outputStrs) {
            System.out.println(item);
        }
    }
}
