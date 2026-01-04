package lab_03_loop_array;

import java.util.Arrays;

public class ArrayLearning {

    public static void main(String[] args) {

        //init array with default 0 for int
        int[] marks = new int[5];
        System.out.println(Arrays.toString(marks)); // [0,0,0,0,0]
        Arrays.fill(marks, 10);
        System.out.println(Arrays.toString(marks)); // [10,10,10,10,10]

        //sort
        int[] random = {9, 20, 48, 8, 40, 23, 5};
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
        String[] names = {"Bob", "Vo", "Mike", "Adnan"};
        Arrays.sort(names);//natural sort
        for(String name:names){
            System.out.printf("%s \t",name);
        }
        /*
        Signature:
        System.arraycopy(from,fromIndex,to,toIndex,count);
         */

        int[] smallPrimes = {2, 3, 5, 7, 11, 17, 19};
        int[] toDestinations = new int[3];
        System.arraycopy(smallPrimes, 0, toDestinations, 0, 2); //[2,3,0]
        System.out.println(Arrays.toString(toDestinations));


    }

}
