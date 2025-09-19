package lab_06_OOPConcept.GuessingGame;

import java.util.Scanner;

public class GuessGameTest {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        Scanner scanner = new Scanner(System.in);
        boolean isContinued = true;
        while(isContinued){
            guessGame.startGame();
            System.out.println("Do you want to continue? y/n : ");
            String userOption = scanner.next().toLowerCase();
            isContinued = (userOption.equals("y")?true:false);
        }
        System.out.println("Game Over! Thank you!");
        System.out.println("====================");
    }
}
