package lab_02_Operator;

public class lab0200_operatorLearning {
    public static void main(String[] args){

        // cong, tru, nhan, chia
        int myNum1 = 9;
        int myNum2 = 5;

        int cong = myNum1 + myNum2;
        int tru = myNum1 - myNum2;
        int nhan = myNum1 * myNum2;
        float chiaPhanNguyen = myNum1/myNum2;
        float chiaPhanDu = myNum1%myNum2;


        //printf
        System.out.printf("%d / %d = %d \n" , 4,2,2);
        System.out.printf("%f / %f = %f \n" , 4.0,2.0,2.0);
        System.out.printf("%c / %c = %c \n" , '4','2','2');
        System.out.printf("%s / %s = %s \n" , "4","2","2");


        //prefix, postfix
        int a = 1;
        int b = 2;
        int c = ++a + b++; // c = 4


        //HANG_SO
        final int OPENINGTIME = 8;


        System.out.println(10 & 8);
        /*bitwise
        1 1 1 1
         8  4  2 1
            10 = 1010
            08 = 1000
         10&08 = 1000

         */







    }


}
