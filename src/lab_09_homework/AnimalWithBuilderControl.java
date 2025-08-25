package lab_09_homework;

import java.util.Arrays;
import java.util.List;

public class AnimalWithBuilderControl {

    public static AnimalWithBuilder racing(List<AnimalWithBuilder> animals){
         int speedMax = 1;
         AnimalWithBuilder winner = null;
         for (AnimalWithBuilder animal : animals) {
            if(animal.getSpeed()>speedMax){
                speedMax = animal.getSpeed();
                winner = animal;
            }
        }
         return winner;
    }

    public static void printAnimals(List<AnimalWithBuilder> animals){
        for (AnimalWithBuilder animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
