package lab_12_generic;

public abstract class Animal {
    void eat(){
        System.out.println("animal eating...");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("dog eating ...");
    }

}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("cat eating ...");
    }

}
