package lab_03_loop_array;

import java.security.SecureRandom;

public class TenGreenBottles {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String greenBottle = " green bottles ";
        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                greenBottle = " green bottle ";
            }
            System.out.println(bottlesNum + greenBottle + "hanging on the wall");
            System.out.println(bottlesNum + greenBottle + "hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall");
            bottlesNum--;

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + greenBottle + "hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall.");
            }
        }
    }
}


