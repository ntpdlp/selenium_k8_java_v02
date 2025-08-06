package lab_02_Operator;

import java.util.Random;

public class RandomNumbers {

    static Random random;

    private RandomNumbers(){
        random = new Random();
    }

    /**
     * use this method to get a int random, call like this
     * int myInt = RandomNumbers.getRandomInt();
     */
    public static int getRandomInt(){
        if (random == null) new RandomNumbers();
        return random.nextInt();

    }


    public static int getRandomInt(int lower, int upper){
        if(lower > upper) return 0;
        if(lower == upper) return lower;
        int different = upper - lower;
        int start = getRandomInt();

        //range from 0..different-1
        start = Math.abs(start)%(different + 1);
        start += lower;
        return start;
    }

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt() + ", " + r.nextInt() + ", " + r.nextInt());
        r = new Random();
        System.out.println(r.nextInt() + ", " + r.nextInt() + ", " + r.nextInt());

    }
}
