package lab_04_method;

import java.util.Scanner;

public class lab_04_NumberGame {

    public static void main(String[] args) {

        int userOption = printMenu();
    }

    private static int printMenu() {

        System.out.println("=============MENU===========");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        return choice;
    }

}
