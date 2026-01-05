package lab_10_OOP_Abstract.helloabstractclass;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    String name;

    abstract void bark();

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name is: " + name);
    }
}

class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("bow bow");
    }
}

class Cat extends Animal {
    @Override
    void bark() {
        System.out.println("meow meow");
    }
}


public class AnimalRunner {
    public static void main(String[] args) {
        List<Animal> pets = new ArrayList<>();
        Animal dogie = new Dog();
        dogie.setName("Lulu");
        Animal catie = new Cat();
        catie.setName("Kitty");
        pets = List.of(dogie,catie);

        for (Animal pet : pets) {
            pet.printName();
            pet.bark();
        }
    }
}



