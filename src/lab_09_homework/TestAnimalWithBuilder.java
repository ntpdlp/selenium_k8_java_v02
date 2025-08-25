package lab_09_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnimalWithBuilder {

    public static void main(String[] args) {
        AnimalWithBuilder tiger = new AnimalWithBuilder.Builder().setName("Tiger").setSpeed(100).setFlyable(false).build();
        AnimalWithBuilder dog = new AnimalWithBuilder.Builder().setName("Dog").setSpeed(60).setFlyable(false).build();
        AnimalWithBuilder horse = new AnimalWithBuilder.Builder().setName("Horse").setSpeed(75).setFlyable(false).build();
        AnimalWithBuilder eagle = new AnimalWithBuilder.Builder().setName("Eagle").setSpeed(80).setFlyable(true).build();
        AnimalWithBuilder snake = new AnimalWithBuilder.Builder().setName("Snake").setSpeed(50).setFlyable(false).build();

        AnimalWithBuilderControl.printAnimals(Arrays.asList(tiger,dog,horse,eagle,snake));
        AnimalWithBuilder animalWinner = new AnimalWithBuilderControl().racing(Arrays.asList(tiger,dog,horse,eagle,snake));
        System.out.println(" ==> Winner is: " + animalWinner.toString());
        
    }
}
