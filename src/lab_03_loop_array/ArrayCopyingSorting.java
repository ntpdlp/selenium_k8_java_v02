package lab_03_loop_array;

import java.util.Arrays;

public class ArrayCopyingSorting {

    public static void main(String[] args) {
            /*
    Signature:
        System.arraycopy(from,fromIndex,to,toIndex,count);
        Arrays.sort(arr);

     */

        int[] smallPrimes = {2,3,5,7,11,17,19};
        int[] to = new int[3];

        System.arraycopy(smallPrimes,0,to,0,2); //[2,3,0]
        for (int item : to) {
            System.out.println(item);
        }


        //sort
        int[] random = {9,20,48,8,40,23,5};
        Arrays.sort(random);
        for (int item : random) {
            System.out.println(item);
        }


        String[] names = {"Bob","Vo","Mike","Adnan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

}
