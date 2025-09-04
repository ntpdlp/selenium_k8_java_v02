package lab_12_StrategyDesignPattern;

public class QuackMute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("No Quack !!!");
    }
}
