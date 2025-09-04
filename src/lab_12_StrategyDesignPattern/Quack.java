package lab_12_StrategyDesignPattern;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
