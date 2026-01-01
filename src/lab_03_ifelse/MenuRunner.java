package lab_03_ifelse;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Choices are available:");
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        System.out.println("Enter your choice: ");
        int yourChoice = scanner.nextInt();

        switch (yourChoice){
            case 1:
                System.out.printf("result = %d", number1+number2);
                break;
            case 2:
                System.out.printf("result = %d", number1 - number2);
                break;
            case 3:
                System.out.printf("result = %d", number1 * number2);
                break;
            case 4:
                System.out.printf("result = %f", (float)number1 / number2);
                break;
            default:
                System.out.println("please correct your choice: 1, 2, 3 or 4");
        }
    }
}
