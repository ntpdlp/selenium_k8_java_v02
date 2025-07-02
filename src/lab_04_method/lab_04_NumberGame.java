package lab_04_method;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_04_NumberGame {

    public static void main(String[] args) {

        String isPlaying = "yes";
        ArrayList<Integer> generatedListNumbers = generateAllNumbers();
        while(isPlaying.equals("yes")){
            int userOption = printMenu();
            switch (userOption){
                case 1:
                    System.out.println(generatedListNumbers);
                    break;
                case 2:
                    findMax(generatedListNumbers);
                    break;
                case 3:
                    findMin(generatedListNumbers);
                    break;
                case 4:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the search number: ");
                    Integer number = scanner.nextInt();
                    String findingResult = (searchNumber(generatedListNumbers,number) == true)?"found":"not found";
                    System.out.println(findingResult);
                    break;
                default:
                    System.out.println("Wrong choice! please read menu carefully");
            }
            System.out.println("Would you want to continue? yes/no: ");
            Scanner scanner = new Scanner(System.in);
            isPlaying = scanner.next().toLowerCase();
            if (isPlaying.equals("no")){
                System.out.println("Thank you!");
            }
        }

    }

    private static int printMenu() {

        System.out.println("=============MENU===========");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice =  scanner.nextInt();
        return choice;

    }

    private static ArrayList<Integer> generateAllNumbers(){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            Integer num = new SecureRandom().nextInt(1000);
            nums.add(num);
        }
        return nums;
    }


    private static void findMax(ArrayList<Integer> list){
        Integer max = list.get(0);
        for (Integer item : list) {
            if(max < item){
                max = item;
            }
        }
        System.out.println("Maximum number is: " + max);
    }


    private static void findMin(ArrayList<Integer> list){
        Integer min = list.get(0);
        for (Integer item : list) {
            if(min > item){
                min = item;
            }
        }
        System.out.println("Minimum number is: " + min);
    }
    
    private static boolean searchNumber(ArrayList<Integer> list, Integer number){

        for (Integer item : list) {
            if(item.equals(number)){
                return true;
            }
        }
        return false;
    }

}
