package lab_08_Homework.animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnimal {

    public static void main(String[] args) {

        Animal horse = new Horse("Horse");
        Animal tiger = new Tiger("Tiger");
        Animal dog = new Dog("Dog");

        List<Animal> animals = new ArrayList<>(Arrays.asList(horse,dog,tiger));
        AnimalController.printAnimals(animals);
        AnimalController.Racing(animals);
    }
}
