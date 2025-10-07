package lab_06_OOP_GameStartUp.fullVersion;

import java.util.ArrayList;

public class Startup {
    /*
    Properties
     */
    private ArrayList<String> locationCells;
    private int numOfHits;
    private String name;


    /*
    Methods
     */

    @Override
    public String toString() {
        return "Startup{" +
                "locationCells=" + locationCells +
                ", numOfHits=" + numOfHits +
                ", name='" + name + '\'' +
                '}';
    }

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public int getNumOfHits() {
        return numOfHits;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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
    public String checkYourself(String guess){
        String result = "miss";

        if(locationCells.contains(guess)){
            locationCells.remove(guess);
            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                numOfHits++;
                result = "hit";
            }
        }//end_if

        return result;
    }

    public boolean isStartupSunk(){
        return locationCells.isEmpty()?true:false;
    }
}
