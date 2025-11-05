package lab_12_generic;

import java.util.List;

public class AnimalTestDriver {
    public static void main(String[] args) {
        List<Animal> animalList = List.of(new Dog(), new Cat());
        List<Animal> vaccinatedAnimal = takeAnimals(animalList);

        List<Dog> dogList = List.of(new Dog(), new Dog());
        List<Dog> vaccinatedDog = takeAnimals(dogList);
        vaccinatedDog.add(new Dog()); // will get error since generic created an ImmutableCollection

    }
    public static <T extends Animal> List<T> takeAnimals(List<T> animalList){
        animalList.forEach(animal -> animal.eat());
        return animalList;
    }
}
