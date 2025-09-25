package lab_06_OOP_GameStartUp.simpleVersion;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class GameHelper {

    public int getUserInput(Scanner scanner){
        System.out.println("Enter your guessing number from 0-6: ");
        int userGuess = scanner.nextInt();
        return userGuess;
    }

    public ArrayList<Integer> generateLocation(){
        int randPos = new SecureRandom().nextInt(5);
        ArrayList<Integer> locationCells = new ArrayList<>();
        locationCells.add(randPos);
        locationCells.add(randPos+1);
        locationCells.add(randPos+2);
        return locationCells;

    }
}
