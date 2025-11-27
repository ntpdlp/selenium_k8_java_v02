package lab_03_loop_array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class IntArray {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ana","Peter","Bana"));
        Collections.sort(names);
        System.out.println(names);
        class Dog{
            protected String name;
            protected int age;

            private Dog(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        class Puppy extends Dog{
            private String color;
            private Puppy(String name, int age, String color) {
                super(name, age);
                this.color = color;
            }

            @Override
            public String toString() {
                return "Puppy{" +
                        "color='" + color + '\'' +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }



        Puppy lulu = new Puppy("Lulu",1,"orange");
        System.out.println(lulu);


    }

    public final static void testArray() {
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
        String[] names = {"teo", "ti", "tun"};
        for (String name : names) {
            System.out.println(name);
        }
    }

}
