package lab_06_OOP_GameStartUp.simpleVersion;

import lab_06_OOP_GameStartUp.GameHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleStartupTestDrive {

    /**
     position 1n-array: 0 1 2 3 4 5 6
     simple startup   :   x x x        (random generated, 3 positions)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameHelper gameHelper = new GameHelper();
        SimpleStartup dot = new SimpleStartup();

        //1.assign location for Startup
        ArrayList<String> locations = gameHelper.generateLocation();
        dot.setLocationCells(locations);

        //2.check guess
        ArrayList<String> remainingLocations = new ArrayList<>();
        for (String location : locations) {
            remainingLocations.add(location);
        }
        int numOfGuesses = 0;
        String testResult = "failed";
        while (!dot.isStartupSunk()){
            String userGuess = gameHelper.getUserInput(scanner);
            numOfGuesses++;
            testResult = dot.checkYourself(userGuess);
            if (testResult.equals("kill")){
                System.out.println("==>> You took " + numOfGuesses + " guesses");
            }
        }//end_while


    }

}
