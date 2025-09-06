package lab_12_StrategyDesignPattern;

public class DuckMallar extends Duck{
    DuckMallar(){
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am mallard duc, making sound quack quack");
    }
}
