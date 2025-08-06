package lab_02_Operator;

public class HW_Prob01 {

    public static void main(String[] args) {

        int rand1 = RandomNumbers.getRandomInt(1,9);
        System.out.println(Math.pow(Math.PI,rand1));

        int rand2 = RandomNumbers.getRandomInt(3,14);
        System.out.println(Math.pow(rand2,Math.PI));
    }
}
