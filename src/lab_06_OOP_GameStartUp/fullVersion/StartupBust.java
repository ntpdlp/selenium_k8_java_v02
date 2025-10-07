package lab_06_OOP_GameStartUp.fullVersion;

import lab_06_OOP_GameStartUp.GameHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StartupBust {
    GameHelper helper;
    ArrayList<Startup> startups;
    int numOfGuesses;

    StartupBust(){
        helper = new GameHelper();
        startups = new ArrayList<>();
        numOfGuesses = 0;
    }

    public void setupGame(){
        Startup cabista = new Startup();
        Startup hacqi = new Startup();
        Startup poniez = new Startup();

        //setName
        cabista.setName("Cabista");
        hacqi.setName("Hacqi");
        poniez.setName("Poniez");

        //setLocation
        cabista.setLocationCells(helper.generateLocation());
        poniez.setLocationCells(helper.generateLocation());
        hacqi.setLocationCells(helper.generateLocation());

        //init arraylist
        this.startups = new ArrayList<>(Arrays.asList(cabista,hacqi,poniez));


        //for debug
        for(Startup startup : startups){
            System.out.println(startup.getName());
            for (String locationCell : startup.getLocationCells()) {
                System.out.print(locationCell + " ");
            }
            System.out.println("");
        }




    }

    public void startPlaying(){
        System.out.println("playing....");
        Scanner scanner = new Scanner(System.in);

        while(!startups.isEmpty()){
            String userGuess = helper.getUserInput(scanner);
            String result = checkUserGuess(userGuess);
            this.numOfGuesses++;
        }
        System.out.println(">> kill all start-ups!!");
        finishGame();
    }

    public String checkUserGuess(String guess){
        String result = "miss";
        for(int i = 0; i<startups.size(); i++) {
            result = startups.get(i).checkYourself(guess);
            if (result == "hit") {
                ArrayList<String> remainingLocations = startups.get(i).getLocationCells();
                remainingLocations.remove(guess);
                //update new-location remaining locations for each start-up
                startups.get(i).setLocationCells(remainingLocations);
                break;
            } else if (result == "kill") {
                result = result + ": " + startups.get(i).getName(); //kill start_up_nameABC
                startups.remove(i);
                break;
            }
        }
        System.out.println(result);
        return result;
    }


    public void finishGame(){
        System.out.println("You guessed: " + this.numOfGuesses + " times.");

        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
        }else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
        }
    }

}
