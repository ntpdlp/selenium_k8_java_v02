package lab_02_Operator;

public class HW_Prob05 {

    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        for (int index = 0; index < 4; index++) {
            for (int j = 0; j < 4; j++) {
                nums[index][j] = RandomNumbers.getRandomInt(1,99);

            }
        }

        final int ROWS = 4;
        int printLoop = ROWS/2;
        int index = 0;
        while(printLoop>0){
            for (int i = 0; i < 4; i++) {
                System.out.printf("%-10d",nums[index][i]); //0 2
            }
            System.out.println();

            index++;
            for (int j = 0; j < 4; j++) {
                System.out.printf("%s","+");
                System.out.printf("%-9d",nums[index][j]); //1 3
            }
            System.out.println();

            for (int k = 0; k < 4; k++) {
                System.out.printf("%-10s","----");
            }
            System.out.println("\r\n\r\n\r\n");

            index++;
            printLoop--;
        }



    }
}
