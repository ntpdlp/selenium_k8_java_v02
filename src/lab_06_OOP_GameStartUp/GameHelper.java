package lab_06_OOP_GameStartUp;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GameHelper {

    public String getUserInput(Scanner scanner){
        System.out.println("Enter your guessing location A-G + 0-6: ");
        String userGuess = scanner.next().toUpperCase();
        return userGuess;
    }


    public ArrayList<String> generateLocation(){
        //0: if generate (A,B,C,D,E,F,G) side : B0,C0,D0
        //1: if generate (0-6)   e.g: A2,A3,A4
        ArrayList<String> chars = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G"));
        int genType = new SecureRandom().nextInt(2);
        ArrayList<String> locationCells = new ArrayList<>();
        if(genType == 1){
            //get 1 char
            String randChar = chars.get(new SecureRandom().nextInt(7));
            //get 3 numbers
            int randPos = new SecureRandom().nextInt(5);
            locationCells.add(randChar + String.valueOf(randPos));
            locationCells.add(randChar + String.valueOf(randPos+1));
            locationCells.add(randChar + String.valueOf(randPos+2));
        } else if (genType == 0) {
            //get 1 num
            int randPos = new SecureRandom().nextInt(7); // from 0-6, exclusive 7.
            //get 3 chars
            int posChar = new SecureRandom().nextInt(5);
            locationCells.add(chars.get(posChar) + randPos);
            locationCells.add(chars.get(posChar + 1) + randPos);
            locationCells.add(chars.get(posChar + 2) + randPos);
        }

        return locationCells;

    }
}
