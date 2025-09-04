package lab_12_StrategyDesignPattern;

public class QuackSqeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Sqeak Sqeak");
    }
}
