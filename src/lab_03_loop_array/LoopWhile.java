package lab_03_loop_array;

import java.security.SecureRandom;
import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {

        boolean isContinued = true;
        while (isContinued){
            System.out.println("============Menu============");
            System.out.println(" 0: de thoat");
            System.out.println(" 1: de tao so ngau nhien");
            System.out.println("Moi ban chon: ");

            Scanner scanner = new Scanner(System.in);
            int yourNumber = scanner.nextInt();

            if(yourNumber == 0){
                isContinued = false;
            }else if(yourNumber == 1){
                //tao so random
                System.out.printf(">> con so ngau nhien la: %d \n", new SecureRandom().nextInt(1000));

            }else{
                System.out.println("Nhap sai, hay nhap lai 0 hoac 1");
            }
        }
        System.out.println("thank you, see you again!");
    }
}
