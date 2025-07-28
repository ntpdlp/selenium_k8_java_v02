package lab_02_Operator;

import java.util.Date;
import java.util.StringJoiner;

public class lab02_JavaStringOperator {

    public static void main(String[] args) {

        //charAt()
        System.out.println("hello".charAt(2));

        //subString
        String name = new String("Robert");
        System.out.println(name.substring(2,4));  //be
        System.out.println(name.substring(0,0));  //
        System.out.println(name.substring(0,name.length())); //Robert

        //indexOf
        System.out.println(name.indexOf('t')); //5
        System.out.println(name.indexOf('d')); //-1


        //startsWith
        System.out.println(name.startsWith("Rob")); //true
        System.out.println(name.startsWith("App")); //false


        //equals
        System.out.println(name.equals("Robert")); //true

        //StringJoiner
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("Banana")
                .add("Apple")
                .add("Mango");

        System.out.println(sj.toString());

        //compareTo used to sort String
        System.out.println("a".compareTo("b"));


        //Format Console Output
        /* %[arg$][flags][width][.precision]conversion
            arg$: optional
            flag: optional
            width: optional
            . : optional
            conversion:
                s: string
                b or B: boolean
                c or C: Unicode character
                h or H: hexadecimal
                o: octal integer
                f: floating number
                t or T: time or date
                    D: Date representation as month/day/year
                    c: full date and time
                    H: 24 hour format
                    I: 12 hour format

         */
        System.out.printf("%f\n",1955.55f);    //1955.550049
        System.out.printf("%.2f\n",1955.55f);  //1955.55
        System.out.printf("%10.2f\n",1955.55f);//   1955.55
        System.out.printf("%10.0f\n",1955.55f);//         1956  (no decimal digits)

        int age = 18;
        System.out.printf("Happy birthday %s, can't believe your age is %d\n",name,age);
        String out = String.format("Happy birthday %s, can't believe your age is %d",name,age);
        System.out.println(out);

        String today01 = String.format("Today is %tD",new Date()); //Today is 07/28/25
        String today02 = String.format("Today is %TD",new Date()); //Today is 07/28/25
        String today03 = String.format("Today is %tc",new Date()); //Today is Mon Jul 28 16:28:16 PDT 2025
        System.out.println(today01);
        System.out.println(today02);
        System.out.println(today03);

    }
}
