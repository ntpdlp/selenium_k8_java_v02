package lab_06_OOPConcept.GuessingGame;

import java.security.SecureRandom;

public class GuessGame {
    private Player player01;
    private Player player02;
    private Player player03;

    GuessGame() {
        player01 = new Player();
        player02 = new Player();
        player03 = new Player();
    }

    public void startGame() {
        int numberPlayer01 = player01.guess();
        int numberPlayer02 = player02.guess();
        int numberPlayer03 = player03.guess();

        boolean isWinnerPlayer01 = false;
        boolean isWinnerPlayer02 = false;
        boolean isWinnerPlayer03 = false;

        int rand = new SecureRandom().nextInt(10);

        if (numberPlayer01 == rand) {
            isWinnerPlayer01 = true;
        } else if (numberPlayer02 == rand) {
            isWinnerPlayer02 = true;
        } else if (numberPlayer03 == rand) {
            isWinnerPlayer03 = true;
        }

        //Xet ket qua
        if (isWinnerPlayer01 || isWinnerPlayer02 || isWinnerPlayer03) {
            System.out.println("Winner is Player 01? " + isWinnerPlayer01);
            System.out.println("Winner is Player 02? " + isWinnerPlayer02);
            System.out.println("Winner is Player 03? " + isWinnerPlayer03);
        }
        System.out.println("Number by program is: " + rand);
        System.out.println("Player01 guessed: " + player01.getNumber());
        System.out.println("Player02 guessed: " + player02.getNumber());
        System.out.println("Player03 guessed: " + player03.getNumber());

    }
}
