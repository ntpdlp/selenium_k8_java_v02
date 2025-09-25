package lab_06_OOP_GameStartUp.simpleVersion;

import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<Integer> locationCells;
    private int numOfHits;

    public ArrayList<Integer> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<Integer> locationCells) {
        this.locationCells = locationCells;
    }

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setNumOfHits(int numOfHits) {
        this.numOfHits = numOfHits;
    }

    /**
     *
     * @param guess
     * @return
     *              if 0_cell was hit => "miss"
     *              if 1_cell were hit => "hit"
     *              if 3_cells were hit => "kill"
     */
    public String checkYourself(int guess){
        String result = "miss";

        if(locationCells.contains(Integer.valueOf(guess))){
            locationCells.remove(Integer.valueOf(guess));
            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                numOfHits++;
                result = "hit";
            }
        }//end_if

        System.out.println(result);
        return result;
    }

    public boolean isStartupSunk(){
        return locationCells.isEmpty()?true:false;
    }
}
