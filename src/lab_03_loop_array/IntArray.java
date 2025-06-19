package lab_03_loop_array;

public class IntArray {

    public static void main(String[] args) {

        byte arrayLen = 5;

        /*
        //declare: 2 ways
        int[] nums = new int[arrayLen];
        for (byte index = 0; index < arrayLen; index++) {
            System.out.println(nums[index]); // 0 0 0 0 0
        }

        int[] nums2 = {1,2,3,4,5};
        for (int index = 0; index < 5; index++) {
            System.out.println(nums2[index]);
        }


        //default value
        byte[] nums3 = new byte[arrayLen];
        for (int index = 0; index < nums3.length; index++) {
            System.out.println(nums3[index]); // 0 is default number
        }
        */

        boolean[] nums4 = new boolean[arrayLen];
        for (int index = 0; index < nums4.length; index++) {
            System.out.println(nums4[index]); //false is default boolean
        }


        int[] nums5 = new int[arrayLen];
        for (int index = 0; index < nums5.length; index++) {
            nums5[index] = index++; //0 0 2 0 4
        }

        //Enhanced For
        String[] names = {"teo","ti","tun"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
