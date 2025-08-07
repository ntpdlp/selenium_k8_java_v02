package lab_02_Operator;

import java.util.Arrays;

public class lab02_ArraySorting {

    public static void main(String[] args) {
        int[] nums = {59,36,2,98,44};
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }


        //String array
        String[] names = {"Vovi","Yan","Adnan","Michael"};
        Arrays.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
