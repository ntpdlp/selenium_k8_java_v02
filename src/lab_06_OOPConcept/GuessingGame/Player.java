package lab_06_OOPConcept.GuessingGame;

import java.security.SecureRandom;

public class Player {
    private int number;


    public int getNumber() {
        return number;
    }

    public int guess(){
        number = new SecureRandom().nextInt(10);
        return number;
    }
}
