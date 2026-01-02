package lab_03_conditions;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        int yourChoice;
        do{
            System.out.println("Choices are available:");
            System.out.println("1. add");
            System.out.println("2. subtract");
            System.out.println("3. multiply");
            System.out.println("4. divide");
            System.out.println("5. EXIT");
            System.out.println("Enter your choice: ");
            yourChoice = scanner.nextInt();

            if(yourChoice ==1 || yourChoice == 2 || yourChoice == 3 || yourChoice ==4){
                System.out.println("Enter number 1: ");
                int number1 = scanner.nextInt();
                System.out.println("Enter number 2: ");
                int number2 = scanner.nextInt();

                switch (yourChoice){
                    case 1:
                        System.out.printf("result = %d \n", number1+number2);
                        break;
                    case 2:
                        System.out.printf("result = %d \n", number1 - number2);
                        break;
                    case 3:
                        System.out.printf("result = %d \n", number1 * number2);
                        break;
                    case 4:
                        System.out.printf("result = %f \n", (float)number1 / number2);
                        break;
                    default:
                        System.out.println("please correct your choice: 1, 2, 3 or 4");
                }
            }else if(yourChoice == 5){
                System.out.println("Byebye!!");
                isContinue = false;
                break;
            }
        }while(isContinue == true);
    }
}
