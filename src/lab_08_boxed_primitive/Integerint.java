package lab_08_boxed_primitive;

public class Integerint {

    public static void main(String[] args) {
        //convert between Integer <-> int
        Integer x = 10;
        int xx = x.intValue();

        int y = 5;
        Integer yy = Integer.valueOf(y);

        //Autoboxing
        Integer[] arr = {10,5,9};
        int new_value = 5;
        arr[0] = new_value; //aubo-boxing happens here


        /*
        Boxed-Primitive
        int > Integer
        char > Character
        float > Float
        byte > Byte
        short > Short
        double > Double
        long > Long
        boolean > Boolean
         */

        /*
        //Null exceptional Error example.
        Integer no_assigned_value;
        System.out.println(no_assigned_value.intValue()); //NullPointerException
        */

    }
}
