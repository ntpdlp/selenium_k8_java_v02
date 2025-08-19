package lab_08_Homework.animal;

import java.util.List;

public class AnimalController {

    public static void Racing(List<Animal> animals){

        String winner = "";
        int speed = 0;
        for (int item = 0; item < animals.size(); item++) {
            if(animals.get(item).getSpeed() > speed){
                speed = animals.get(item).getSpeed();
                winner = animals.get(item).getName();
            }
        }

        System.out.println("Winner is: " + winner + ", with speed: " + speed);
    }


    public static void printAnimals(List<Animal> animals){
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ", speed = " + animal.getSpeed() );
        }
    }
}
